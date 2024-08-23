package ex0715.exam;
import java.util.Scanner;
public class ReportExamV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Report report = new Report();
		
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 성적표 구하기 | 2. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			
			int i = scanner.nextInt();
			
			if(i == 1) {
				System.out.print("이름을 입력하세요:");
				String name = scanner.next();
				
				System.out.print("국어점수를 입력하세요:");
				int kor = scanner.nextInt();
				
				System.out.print("영어점수를 입력하세요:");
				int eng = scanner.nextInt();
				
				System.out.print("수학점수를 입력하세요:");
				int math = scanner.nextInt();
				
				report.result(name,kor,eng,math);
			}
			else if (i == 2) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else System.out.println("1번과 2번 두개의 번호를 골라서 다시 눌러주세요");
			
			
		}

	}

}
