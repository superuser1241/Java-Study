package ex0712;
import java.util.Scanner;

class Calc {
	//총점 메소드
	private int calcTotal(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	//평균 메소드
	private double calcAvg(int total, int x) {
		return (double) total/x;
	}
	
	//등급 메소드
	private char calcGrade(double avg) {
		if(avg >=90) {
			return 'A';
		}
		else if(avg >=80) {
			return 'B';
		}
		else if(avg >=70) {
			return 'C';
		}
		else if(avg >=60) {
			return 'D';
		}
		else return 'F';
		}
	
		public void score(String name, int kor, int eng, int math) {
        int total = calcTotal(kor, eng, math);
        double average = calcAvg(total, 3); // 3과목
        char grade = calcGrade(average);
        System.out.println("이름: " + name);
        System.out.println("총점: " + total);
        System.out.println("평균: " + average);
        System.out.println("등급: " + grade);
        //this.result(name,total,average,grade);
    }
		
		/*private void result(String name, int total, double average, char grade) {
	        System.out.println("이름: " + name);
	        System.out.println("총점: " + total);
	        System.out.println("평균: " + average);
	        System.out.println("등급: " + grade);
	    }*/
}

public class GradeExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc cc = new Calc();
		
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("1. 성적표 구하기 | 2. 종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			
			int num = sc.nextInt();
			
			if(num ==1) {
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				
				System.out.print("국어 점수를 입력하세요: ");
				int kor = sc.nextInt();
				
				System.out.print("영어 점수를 입력하세요: ");
                int eng = sc.nextInt();

                System.out.print("수학 점수를 입력하세요: ");
                int math = sc.nextInt();
				
                cc.score(name, kor, eng, math);
			}
			else if(num==2) {
				System.out.println("프로그램 종료");
				break;
			}
			else System.out.println("1번과 2번 중 다시 골라주세요. ");
		}
	}
}
