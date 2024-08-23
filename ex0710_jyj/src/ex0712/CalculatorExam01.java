package ex0712;
import java.util.Scanner;

public class CalculatorExam01 {
	
	public void calculate(int num1, int num2, String calc) {
        switch (calc) {
            case "+":
                System.out.println("결과: " + (num1 + num2));
                break;
            case "-":
                System.out.println("결과: " + (num1 - num2));
                break;
            case "*":
                System.out.println("결과: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("결과: " + (double)(num1 /  num2));
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("연산기호가 잘못 연결되었습니다.");
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorExam01 cce = new CalculatorExam01();
		
		while(true) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1, 더하기 | 2. 빼기 | 3. 곱하기 | 4. 나누기 | 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("연산에 맞는 번호를 선택해주세요:");
			
			int num = sc.nextInt();
			
			if(num >=1 && num <=4) {
				System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                
                String calc = "";
                
                switch (num) {
                case 1:
                	calc = "+";
                    break;
                case 2:
                	calc = "-";
                    break; 
                case 3:
                	calc = "*";
                    break;
                case 4:
                	calc = "/";
                    break;
            }
                cce.calculate(num1, num2, calc);
			}
			else if (num==5) {
				System.out.println("프로그램을 종료합니다.");
                System.exit(0);
			}
			else System.out.println("1~5사이의 번호를 다시 입력해주세요");
		}
	}

}
