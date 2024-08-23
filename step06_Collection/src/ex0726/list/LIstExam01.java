package ex0726.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class LIstExam01 extends ArrayList<Integer>{
//public class LIstExam01 extends Vector<Integer>{
//public class LIstExam01 extends LinkedList<Integer>{
	public LIstExam01() {
		super(5);  //int형 받는 부모생성자 호출
		
		//추가
		super.add(8);           //오토박싱
		super.add(4);
		super.add(16);
		this.add(2);
		this.add(10);
		this.add(5);
		add(7);
		
		System.out.println("추가된 요소의 개수: "+ this.size());
		
		//요소를 꺼내기
		for(int i =0; i<this.size(); i++) {
			Integer v = super.get(i);                    //언박싱
			System.out.println(v);
		}
		
		//개선된 for문 사용해서 요소 꺼내기
		System.out.println("---------개선된 for문-------------");
		for(int v : this) {//super는 사용불가 for(타입 변수 : 반복대상){}
			System.out.println(v);
		}
		System.out.println("this = "+ this);
		
		//삭제
		super.remove(2);
		
		System.out.println("삭제 후 this = "+ this);
		System.out.println("삭제 후 저장된 수 = "+ this.size());
		
		//Collections.sort(this); //오름차순 ASC
		Collections.sort(this, Collections.reverseOrder());  //내림차순 DESC
		System.out.println("정렬 후 this = "+this);
		
	}
	
	public static void main(String[] args) {
		new LIstExam01();
	}
}
