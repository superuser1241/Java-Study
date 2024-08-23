package ex0710.제어문;

public class IfExam01 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*31)+1;
		if(a % 2 ==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
