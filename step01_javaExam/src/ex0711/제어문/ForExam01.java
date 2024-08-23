package ex0711.제어문;

public class ForExam01 {

	public static void main(String[] args) {
		//1~100까지 한줄로 출력
		for(int i =1; i<=100; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//A~Z까지 한줄로 출력
		for(char a = 'A'; a<='Z'; a++) {
			System.out.println(a);
		}
		System.out.println();
		
		//1~10까지 합 구해서 출력
		int sum=0;
		for(int i = 1; i <=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		System.out.println();
		
		//1~100사이의 7배수만 출력
		for(int i = 1; i <=100; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		//100~1사이의 5배수만 출력
		for(int i = 100; i >=1; i--) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}

}
