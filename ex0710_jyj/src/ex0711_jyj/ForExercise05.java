package ex0711_jyj;

/*이름:주영준
 *날짜:7월 11일
  이중 for문을 활용한 방정식 구하기*/

public class ForExercise05 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				if((4*i)+(5*j)==60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}
}
