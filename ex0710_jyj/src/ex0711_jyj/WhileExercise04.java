package ex0711_jyj;

/*이름:주영준
 *날짜:7월 11일
  While문, Do While문을 활용하여 주사위 눈의 합 구하기 */

public class WhileExercise04 {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		
		while(dice1+dice2!=5) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("("+dice1+","+dice2+")");  //while문
		}
		
		System.out.println("--------------------------");
		
		do {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("("+dice1+","+dice2+")"); //do while문
		}while(dice1+dice2!=5);
	}
}
