package ex0807.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExam {
	public FlatMapExam() {
		List<String> list = new ArrayList<String>();
		list.add("My name is Young Jun");
		list.add("Hava a nice day");
		
		//list.stream().forEach(sentence->System.out.println(sentence));
		
		//list에 있는 항목을 공백 기준으로 분리해서 Stream으로 만들고 싶음
		/*list.stream().flatMap((sentence)->{
			System.out.println(sentence);
			return Arrays.stream(sentence.split(" "));
		}).forEach(n->System.out.println(n));*/
		
		list.stream().flatMap((sentence)->Arrays.stream(sentence.split(" ")))
		.forEach(n->System.out.println(n));
		
		System.out.println("-------------------------------------");
		List<String> list2 = Arrays.asList("10,20,30","40,50,60,70");
		
		list2.stream().flatMapToInt(data->{
			String [] s = data.split(",");
			int [] intArr = new int [s.length];
			
			for(int i=0; i<intArr.length; i++) {
				intArr[i]=Integer.parseInt(s[i]);
			}
			return Arrays.stream(intArr);
		}).forEach(no->System.out.println(no));
	}
	
	public static void main(String[] args) {
		new FlatMapExam();
	}

}
