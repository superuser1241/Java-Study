package ex0717.hw;

import java.util.Scanner;

public class HwReportV3 {

	public static void main(String[] args) {
		/* Java 실습화면.pdf
		 * 19~20슬라이드 (교재 198p 확인문제 9번 동일)
		 * 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서
		 * 최고 점수 및 평균 점수를 구하는 프로그램
		*/
		boolean run = true; //상태변수
		int studentNum = 0; //입력한 학생수
		int[] scores = null;//생성되지 않음
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; //총합
		int max = 0; //최대값
		
		while(run) {//true일동안 반복...
			System.out.println("--------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 |5.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.print("학생 수?> ");
				studentNum = sc.nextInt();
				scores = new int [studentNum];
				
			} else if (selectNo == 2) {
				for (int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = sc.nextInt();
				}
				
			} else if (selectNo == 3) {
				for (int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}
				
			} else if (selectNo == 4) {
				
				for (int i=0;i < scores.length;i++) {
					sum += scores[i];//평균을 구하기 위한 합계
					
					if (scores[i] > max) //최대값  찾기
						 max=scores[i];
				}
				
				double scoreavg = sum/(double)studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+scoreavg);
				
			} else if (selectNo == 5) {
				run = false;
			}else {
				System.out.println("숫자만 입력하세요^^");
			}
		}//while End
		
		System.out.println("프로그램 종료");

	}

}
