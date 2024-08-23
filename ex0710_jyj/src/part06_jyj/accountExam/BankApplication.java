package part06_jyj.accountExam;

import java.util.Scanner;

public class BankApplication {
    static Account[] account = new Account[100];
    static int accountCount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("선택> ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    listAccounts();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    System.out.println("시스템을 종료합니다");
                    System.exit(0);
                default:
                    System.out.println("알맞은 번호를 선택하세요");
                    break;
            }
        }
    }

    static void createAccount() {
        System.out.print("계좌 번호: ");
        int accountNum = Integer.parseInt(sc.nextLine());
        System.out.print("계좌 소유자: ");
        String name = sc.nextLine();
        System.out.print("초기 입금액: ");
        int initMoney = Integer.parseInt(sc.nextLine());

        account[accountCount++]=new Account(accountNum, name, initMoney);
        System.out.println("계좌 만들기 성공했습니다");
    }

    static void listAccounts() {
        System.out.println("계좌 목록");
        for(int i =0; i<accountCount; i++) {
        	System.out.println(account[i]);
        }
    }

    static void deposit() {
        System.out.print("계좌 번호: ");
        int accountNum = Integer.parseInt(sc.nextLine());
        System.out.print("예금액: ");
        int amount = Integer.parseInt(sc.nextLine());

        for(int i =0; i<accountCount; i++) {
        	if(account[i].getAccountNum()!=accountNum) {
        		System.out.println("계좌를 찾을 수 없습니다");
        	}
        	else account[i].setInitMoney(account[i].getInitMoney()+amount);
        	System.out.println("예금에 성공했습니다");
        }
        
        
    }

    static void withdraw() {
        System.out.print("계좌 번호: ");
        int accountNum = Integer.parseInt(sc.nextLine());
        System.out.print("출금액: ");
        int amount = Integer.parseInt(sc.nextLine());

       for(int i=0; i<accountCount; i++) {
    	   if(account[i].getAccountNum()!=accountNum) {
    		   System.out.println("계좌를 못찾겠습니다");
    	   }
    	   else account[i].setInitMoney(account[i].getInitMoney()-amount);
    	   System.out.println("출금에 성공했습니다");
       }
    }
}
