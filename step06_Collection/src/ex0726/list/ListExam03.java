package ex0726.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 {
	/**
	 * 생성자:5명의 사원 등록
	 */
	List<Emp> list = new ArrayList<Emp>();
	public ListExam03() {
		list.add(new Emp(10, "주영준", 26, "서울"));
		list.add(new Emp(50, "이나영", 30, "서울"));
		list.add(new Emp(20, "정미미", 21, "대구"));
		list.add(new Emp(40, "김소희", 23, "부산"));
		list.add(new Emp(30, "장나라", 28, "대구"));
		
		//List에 있는 정보 출력
		for(Emp e : list) {
			System.out.println(e);
		}
	}
	
	/**
	 * 사원 번호에 해당하는 사원정보 검색
	 */
	public Emp findByEmpno(int empno) {
		/*for(int i = 0; i<list.size(); i++) {
			Emp e =  list.get(i);
			if(e.getEmpno() == empno) {
				return e;
			}
		}*/
		for(Emp e : list) {
			if(e.getEmpno() == empno) {
				return e;
			}
		}
		return null;
	}
	/**
	 * 주소를 인수로 전달받아 동일한 주소의 사원들 검색
	 */
	public List<Emp> findByAddr(String addr) {     //깊은복사
		List<Emp> shallowCopyList = new ArrayList<Emp>();
		for(Emp e: list) {
			if(e.getAddr().equals(addr)) {
				shallowCopyList .add(e);
			}
		}
		
		return shallowCopyList;
	}
	
	/**
	 * 사원번호를 기준으로 정렬하기
	 * : Comparable를 구현한 객체를 정렬할 수 있다.
	 */
	public List<Emp> sortByEmpno(){ // 얕은복사
		List<Emp> sortList = new ArrayList<Emp>(list);
		Collections.sort(sortList);
		return sortList;
	}
	/**
	 * 나이를 기준으로 정렬하기
	 * : Comparator
	 */
	public List<Emp> sortByAge(){
		List<Emp> sortList = new ArrayList<Emp>(list);
		//Collections.sort(sortList, AgeComparator);
		/*Collections.sort(sortList,new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				System.out.println("AgeComparator Compare Call");
				return o1.getAge() - o2.getAge();
			}
		});*/
		
		//람다식
		Collections.sort(sortList,(o1,o2) -> o1.getAge() - o2.getAge());
		
		return sortList;
	}
	
	public static void main(String[] args) {
		ListExam03 le = new ListExam03();
		System.out.println("1. 사원번호 검색");
		Emp emp = le.findByEmpno(20);
		System.out.println(emp);
		
		System.out.println("2. 주소 검색");
		List<Emp> resultList = le.findByAddr("서울");
		System.out.println(resultList);
		
		System.out.println("3. 사원 번호 정렬");
		List<Emp> sortList = le.sortByEmpno();
		for(Emp e : sortList)
		System.out.println(e);
		
		System.out.println("4. 사원 나이 정렬");
		resultList = le.sortByAge();
		for(Emp e : resultList)
		System.out.println(e);
	}
}

class AgeComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		System.out.println("AgeComparator Compare Call");
		return o1.getAge() - o2.getAge();
	}
	
}
