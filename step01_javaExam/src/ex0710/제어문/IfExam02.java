package ex0710.제어문;

public class IfExam02 {

	public static void main(String[] args) {
		/*1~12사이의 난수 발생
		 * 발생한 난수가 1이면 일요일 2이면 월 3이면 화...6이면 금 나머지 토요일까지 출력
		 */
		int a = (int)(Math.random()*12)+1;
		if(a==1) {
			System.out.println("일요일");
		}
		else if(a==2) {
			System.out.println("월요일");
		}
		else if(a==3) {
			System.out.println("화요일");
		}
		else if(a==4) {
			System.out.println("수요일");
		}
		else if(a==5) {
			System.out.println("목요일");
		}
		else if(a==6) {
			System.out.println("금요일");
		}
		else {
			System.out.println("토요일");
		}

	}

}
