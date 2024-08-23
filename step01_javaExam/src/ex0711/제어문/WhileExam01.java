package ex0711.제어문;

public class WhileExam01 {

	public static void main(String[] args) {
		//1. 1~100까지 출력
		int num =0;
		while(num<100) {
			num++;
			System.out.println(num);
		}
		
		//2. A~Z까지 출력
		char ch = 'A';
		while(ch<='Z') {
			ch++;
			System.out.println((char)(ch-1));
		}
		//3. 1~100사이의 3배수 합 구해서 출력
		System.out.println("-----------------------");
		int sum =0;
		int number = 0;
		while(number<=100) {
			number++;
			if(number%3==0) {
				sum+=number;
			}
		}System.out.println(sum);
		System.out.println();
		
		//4. 1~100을 10행 10열로 출력(While문 안에 While 문 이용)
		int i =0;
		while(i<10) {
			int j= 1;
			while(j<=10) {
				System.out.print(i*10+j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		//5. While문으로 구구단 출력
		i=2;
		while(i<=9) {
			int j =1;
			while(j<=9) {
				System.out.println(i+"x"+j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

