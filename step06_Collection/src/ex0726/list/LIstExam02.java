package ex0726.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LIstExam02 {
	List<Integer> list; //null
	public LIstExam02() {
		list = new ArrayList<>(5);
		//list = new Vector<>(5);
		//list = new LinkedList<>();
		
		//추가
		list.add(8);           //오토박싱
		list.add(4);
		list.add(16);
		list.add(2);
		list.add(10);
		list.add(5);
		list.add(7);
		
		System.out.println("추가된 요소의 개수: "+ list.size());
		
		//요소를 꺼내기
		for(int i =0; i<list.size(); i++) {
			Integer v = list.get(i);                    //언박싱
			System.out.println(v);
		}
		
		//개선된 for문 사용해서 요소 꺼내기
		System.out.println("---------개선된 for문-------------");
		for(int v : list) {
			System.out.println(v);
		}
		System.out.println("this = "+ list);
		
		//삭제
		list.remove(2);
		
		System.out.println("삭제 후 this = "+ list);
		System.out.println("삭제 후 저장된 수 = "+ list.size());
		
		Collections.sort(list); //오름차순 ASC
		//Collections.sort(list, Collections.reverseOrder());  //내림차순 DESC
		System.out.println("정렬 후 this = "+list);
		
	}
	
	public static void main(String[] args) {
		new LIstExam02();
	}
}
