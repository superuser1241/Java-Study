package ex0802;

import java.util.Scanner;

public class WeightExam {
	int weight=75;
	String password = "1234";
	Scanner sc = new Scanner(System.in);
	
	public int  getWeight(String password) {
		if(this.isPassword(password)==true) {
			System.out.println(weight);
		}
		else System.out.println("비밀번호 불일치");
		return weight;
	}
	
	
	public void setWeight(int weight, String password) {
		if(this.isPassword(password)==true) {
			this.weight=weight;
		}
		else System.out.println("비밀번호 불일치");
	}
	
	public void setPassword(String ps1, String ps2) {
		if(this.isPassword(ps1)==true) {
			this.password = ps2;
		}
	}
	
	public boolean isPassword(String password) {
		if(this.password.equals(password)) {
			return true;
		}
		else return false;
	}
	
	
	
	public void menu() {
		while (true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1. 몸무게 검색| 2. 몸무게 변경 | 3. 비밀번호 변경 | 4. 종료 ");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("선택> ");
            
            int num = sc.nextInt();
            
            if(num==1) {
            	System.out.println("비밀번호를 입력해주세요");
            	String s = sc.next();
            	getWeight(s);
            	
            }else if(num ==2) {
            	System.out.println("비밀번호를 입력해주세요");
            	String s = sc.next();
            	System.out.println("변경 할 몸무게를 입력해주세요");
            	int w = sc.nextInt();
            	setWeight(w,s);
            	
            }else if(num==3) {
            	System.out.println("기존의 비밀번호를 입력해주세요");
            	String s1 = sc.next();
            	System.out.println("변경 할 비밀번호를 입력해주세요");
            	String s2 = sc.next();   	
            	setPassword(s1,s2);
            	
            }else if(num==4) {
            	System.out.println("시스템을 종료합니다");
            	System.exit(0);
            }else System.out.println("번호를 다시 입력하세요");
		}
	}
	

	public static void main(String[] args) {
		new WeightExam().menu();

	}

}
