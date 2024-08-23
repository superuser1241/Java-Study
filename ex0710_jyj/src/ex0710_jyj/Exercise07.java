package ex0710_jyj;

/*이름:주영준
 * 날짜:7월10일
 * 연산자 예제 7번 비교연산자 논리 연산자*/

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x > 7) && (y <= 5));  //and 연산자는 둘다 맞아야 true( 10>7) 그리고 (5 <= 5) 그러므로 true
		System.out.println((x % 3 == 2)||(y % 2 != 1)); //or 연산자는 둘중 하나만 값이 맞아도 true(10 % 3 ==1) 그리고 (5 % 2 ==1)
														//그러므로 false
	}
}