package ex0807.ex02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import ex0807.ex02.Student;

public class SortExam {
	public SortExam() {
		List<Student> list = Arrays.asList(
				new Student("영준",100),
				new Student("희범",90),
				new Student("가현",80),
				new Student("효리",70));
		
		System.out.println("--점수를 기준으로 정렬--");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);
		
		System.out.println("-------------------------------------");
		list.stream().sorted((x,y)-> Integer.compare(x.getScore(), y.getScore()))
		.forEach(System.out :: println);
	}
	
	public static void main(String[] args) {
		new SortExam();
	}

}
