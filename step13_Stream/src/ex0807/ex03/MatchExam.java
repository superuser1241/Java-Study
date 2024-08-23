package ex0807.ex03;

import java.util.Arrays;
import java.util.List;

import ex0807.ex02.Student;

public class MatchExam {
	public MatchExam() {
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		
		int num = Arrays.stream(intArr).max().getAsInt();
		System.out.println(num);
		
		List<Student> list = Arrays.asList(
				new Student("영준",100),
				new Student("희범",90),
				new Student("가현",55),
				new Student("효리",50));
		
		//모든 학생들이 80점 이상 체크
		boolean re1 = list.stream().allMatch((s)->s.getScore()>=80);
		System.out.println(re1);
		
		//80점 이상인 학생들이 몇명인지 체크
		long lo = list.stream()
				.filter((s)->s.getScore()>=80)
				.peek(System.out :: println)
				.count();
		System.out.println(lo);
		
		//학생들중에 한명이라도 60미만 있는지 체크
		boolean re2 = list.stream().anyMatch((s)->s.getScore()<60);
		System.out.println(re2);
		
		
		Arrays.stream(intArr)
		.peek(no->System.out.println(no));  //peek은 중간처리 메소드라서 최종처리 메소드를 넣어야 실행
		
		boolean re = Arrays
		.stream(intArr)
		.anyMatch((i)->i%2==0);
		System.out.println(re);
	}
	
	public static void main(String[] args) {
		new MatchExam();
	}
}
