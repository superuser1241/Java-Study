package ex0806.Chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 키보드 입력을 받아서 상대측에서 데이터 전송하는 Thread
 */

public class SendThread extends Thread {
	Socket sk;
	String name;
	public SendThread(Socket sk , String name) {
		super(name);
		
		this.sk = sk;
		this.name =name;
	}
	
	@Override
	public void run() {
		//키보드 입력 받기
		try(Scanner sc = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(sk.getOutputStream(),true)){
			while(true) {
				String inputData = sc.nextLine();
				if(inputData.equals("exit")) {
					pw.println(inputData);
					break;
				}else pw.println(name+"가 보낸 내용:"+ inputData);
				
			}//while 끝
			
			System.out.println("시스템이 종료되었습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
	}//run 끝
}//class 끝

