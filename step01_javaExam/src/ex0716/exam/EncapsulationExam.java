package ex0716.exam;

import java.util.Scanner;

public class EncapsulationExam {
	private String password  = "1234";
	private int  weight = 70;
	
	public int getSearch(String pwd) {
		this.isCheckPwd(pwd);
		if(password.equals(pwd)) {
			System.out.println(weight);
		}
		else System.out.println("비밀번호 불일치");
		return weight;
	}
	
	public void setChange(int x, String pwd) {
		this.isCheckPwd(pwd);
		if(password.equals(pwd)) {
			weight =x;
			System.out.println(weight);
		}
		else System.out.println("비밀번호 불일치");
		
	}
	
	public void setChangePwd(String pwd1, String pwd2) {
		this.isCheckPwd(pwd1);
		if(password.equals(pwd1)) {
			password = pwd2;
		}
		else System.out.println("비밀번호 불일치");
	}
	
	private boolean isCheckPwd(String pwd) {
		if(password.equals(pwd)) {
			return true;
		}
		else return false;
	}

	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		EncapsulationExam ese = new EncapsulationExam();
		boolean run=true;

		
		while(run) {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1.몸무게 검색  | 2.몸무게 변경   | 3. 비밀번호 변경  |  9.종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택> ");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("비밀번호>");
				String str = sc.next();
				ese.getSearch(str);
			}
			else if (num == 2) {
				System.out.println("비밀번호>");
				String str = sc.next();
				System.out.println("몸무게 변경 값>");
				int i =sc.nextInt();
				ese.setChange(i, str);
			}
			else if (num == 3) {
				System.out.println("비밀번호>");
				String str = sc.next();
				System.out.println("비밀번호 변경 값>");
				String str1 = sc.next();
				ese.setChangePwd(str, str1);
				
			}
			else if (num == 9 ) {
				System.out.println("프로그램을 종료합니다");
				run = false;
			}
			else System.out.println("숫자를 정확하게 다시 적어주세요");

		}
	}
}
