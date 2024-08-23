package mvc.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    private File file = new File("src/mvc/service/save.txt");
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     */
    private ElectronicsServiceImpl() {
        
        try {
        	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");
        	for(String key :rb.keySet()) {
        		String value = rb.getString(key);
        		
        		String [] v = value.split(",");
        		Electronics elec =  new Electronics(Integer.parseInt(v[0]), v[1], Integer.parseInt(v[2]),v[3]);
        		list.add(elec);
    		}
        }
        catch(Exception e) {
        	
        }
      
    }
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) 
			throws ElectronicsArrayBoundsException,DuplicateModelNoException {
		
		if(list.size()>=MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("배열의 길이를 벗어났습니다");
		}
		try {
			this.searchByModelNo(electronics.getModelNo());
			throw new DuplicateModelNoException("중복입니다");
		}
		catch(SearchNotFoundException e) {
			list.add(electronics);
		}
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) {
				return e;
			}
		}
		throw new SearchNotFoundException("모델 넘버가 올바르지않습니다");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		try {
			Electronics e =this.searchByModelNo(electronics.getModelNo());
			e.setModelDetail(electronics.getModelDetail());
		}
		catch(SearchNotFoundException e) {
			throw new SearchNotFoundException("모델 번호에 해당하는 설명이 없습니다");
		}
		
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) {
				list.remove(e);
			}
		}
		throw new SearchNotFoundException("모델 넘버가 올바르지 않습니다");
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> elecList = new ArrayList<Electronics>(list);
		
		Collections.sort(elecList, (o1,o2)-> o1.getModelPrice() - o2.getModelPrice());
		return elecList;
	}
    
} // 클래스 끝 