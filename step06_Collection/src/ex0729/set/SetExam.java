package ex0729.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	//Set<String> set = new HashSet<String>();   //중복이 안되고 순서 상관없이 들어감
	Set<String> set = new TreeSet<String>();  //중복이 안되고 순서 상관 있음
	
	public SetExam(String[] args) {
		//추가
		for(String s : args) {
			boolean re = set.add(s);
			System.out.println(s+"추가 결과:"+re);
		}
		System.out.println("저장된 개수: "+ set.size());
		System.out.println("set= " +set);    //set.toString();
		
		//set 안에 있는 요소를 하나씩 조회 - 꺼내기
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {//다음 요소가 있을동안
			String v = it.next();  //다음 요소를 꺼낸다.
			System.out.print(v);
		}
		System.out.println();
		System.out.println("--------개선된 for문--------");
		for(String s : set) {
			System.out.print(s);
		}
		
		System.out.println("---------제거----------");
		boolean re = set.remove("a");
		System.out.println("제거 결과: "+ re);
		
		System.out.println("제거 후 사이즈: "+set.size()); 
		System.out.println("제거 후 정보: "+set);
		
		
	}
	public static void main(String[] args) {
		new SetExam(args);
	}
}
