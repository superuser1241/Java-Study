package ex0807.ex01;

import java.util.Arrays;
import java.util.List;

public class MapToExam {
	public MapToExam() {
		List<Student> list = Arrays.asList(
				new Student("영준",100),
				new Student("희범",90),
				new Student("가현",80),
				new Student("효리",70));
		//학생의 점수만 Stream으로 만들고 싶음
		list.stream()
		.mapToInt((s)->s.getScore())
		.forEach(System.out::println);
		
		System.out.println();
		
		int sum = list.stream()
		.mapToInt((s)->s.getScore())
		.sum();
		System.out.println("합계: "+sum);
		
		System.out.println();
		
		double avg = list.stream()
				.mapToInt((s)->s.getScore())
				.average()
				.getAsDouble();
		System.out.println("평균: "+avg);
		
		System.out.println();
		
		long count = list.stream()
				.mapToInt((s)->s.getScore())
				.count();
		System.out.println("카운트: "+count);
	}
	public static void main(String[] args) {
		new MapToExam();
	}

}
