package ex0807.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamExam {
	public FilterStreamExam() {
		List<String> list = Arrays.asList("주영준","이나영","이찬범","주영준","이효리");
		
		//stream api
		list.stream()
		.distinct()  //중복제거
		.forEach(System.out :: println);
		
		System.out.println("-----------------------------------------");
		
		/*Stream<String> strStream=list.stream().filter((t)->{
			//기능
			return t.startsWith("이");
		});*/
		
		Stream<String> strStream=list.stream().filter((t)->t.startsWith("이"));
		strStream.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		
		//중복을 제거하고 주로 시작하고 이름을 출력하세요
		list.stream().distinct().filter((t)->t.startsWith("주")).forEach(System.out::println);
		
	}
	public static void main(String[] args) {
		new FilterStreamExam();
	}

}
