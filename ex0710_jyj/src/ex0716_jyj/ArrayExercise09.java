package ex0716_jyj;
import java.util.Scanner;

public class ArrayExercise09 {

    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int studentScore = 0;
        int [] score = null;
        Scanner sc = new Scanner(System.in);

        while(run) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = sc.nextInt();

            if(selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = sc.nextInt();
                score = new int[studentNum];
            }
            else if (selectNo == 2) {
                System.out.println("점수입력>");
                for(int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]> ");
                    studentScore = sc.nextInt();
                    score[i] = studentScore;
                }
            }
            else if (selectNo == 3) {
                for(int i = 0; i < studentNum; i++) {
                    System.out.println("scores[" + i + "]: " + score[i]);
                }
            }
            else if (selectNo == 4) {
                int maxScore = score[0];
                int sum = 0;
                for(int i = 0; i < studentNum; i++) {
                    if(score[i] > maxScore) {
                        maxScore = score[i];
                    }
                    sum += score[i]; 
                }
                double avgScore = (double) sum / studentNum;
                System.out.println("최대 점수: " + maxScore);
                System.out.println("평균 점수: " + avgScore);
            }
            else if (selectNo == 5 ) {
                run = false;
            }
            else {
                System.out.println("번호를 제대로 입력해주세요");
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
