package ex0807.ex01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayPipeLineExam {
	static int sum=0;
	public static void main(String[] args) {
		System.out.println("1. String Array ---");
		String [] strArr = {"나영","효리","미미","미선"};
		Stream<String> strStream=Arrays.stream(strArr);
		strStream.forEach(System.out :: println);
		
		System.out.println("\n2. int Array ---");
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		IntStream intStream=Arrays.stream(intArr);
		intStream.forEach(System.out :: println);
		
		System.out.println("\n3. range() vs rangeClosed()----");
		//intStream = IntStream.range(1, 10); //1~9
		intStream = IntStream.rangeClosed(1, 10); //1~10
		intStream.forEach(no->{
			//System.out.println(no)
			//System.out.println(sum);
			sum+=no;
			
		});
		System.out.println(sum);
	}
	

}
