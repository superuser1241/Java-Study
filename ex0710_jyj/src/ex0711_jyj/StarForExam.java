package ex0711_jyj;

/*이름:주영준
 *날짜:7월 11일
  별찍기 이중 for문 */
public class StarForExam {

	public static void main(String[] args) {
		for(int i = 1; i<=5;i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i= 5; i>=1;i--) {
			for(int j =0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i = 1; i <= 5; i++) {
            for(int j = 5; j > i; j--) { 
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
		
		System.out.println("----------------------");
		
        for(int i = 5; i >= 1; i--) {
            for(int j = 5; j > i; j--) { 
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
	}

}
