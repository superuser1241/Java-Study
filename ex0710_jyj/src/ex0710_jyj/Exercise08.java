package ex0710_jyj;

/*이름:주영준
 * 날짜:7월10일
 * 연산자 예제 8번 %연산 NaN을 검사하는 코드*/

public class Exercise08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로는 나눌 수 없습니다");	
		}
		else {
			double result = z + 10;
			System.out.println("결과"+ result);
		}
	}
}
