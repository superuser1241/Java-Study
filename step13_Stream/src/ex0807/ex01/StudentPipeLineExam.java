package ex0807.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
}

public class StudentPipeLineExam {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("영준",100),
				new Student("희범",90),
				new Student("가현",80),
				new Student("효리",70));
		
		//stream API 이용
		Stream<Student> studentStream = list.stream();
		studentStream.forEach((s)->{
			System.out.println(s.getName());
		});
	}

}
