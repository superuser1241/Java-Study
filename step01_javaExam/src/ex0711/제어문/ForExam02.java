package ex0711.제어문;

public class ForExam02 {

	public static void main(String[] args) {
		// 1~100까지 10행10열로 출력(2중 for문)
		int sum =0;
		for(int i = 1; i<=10; i++) {
			for(int j =1; j<=10;j++) {
				sum++;
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		//1~100까지 10행10열로 출력(for문 안에 if문으로)
		for(int i = 1; i<=100;i++) {
			if(i%10==1) {
				System.out.println();
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		//구구단 출력
		for(int i = 2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println();
		}
	}

}
