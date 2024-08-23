package ex0806.Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 클라이언트와 1:1채팅을 위한 Server
 */

public class ServerChatExam {
	Socket sk;
	public ServerChatExam() {
		try(ServerSocket server = new ServerSocket(8000)){
			System.out.println("클라이언트 접속 대기중.....");
			
			sk = server.accept(); //접속 대기중
			System.out.println(sk.getInetAddress()+"님과 채팅 시작");
			
			//읽기 Thread
			new ServerRecive().start();
			
			//보내기 Thread
			new SendThread(sk,"Server").start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ServerChatExam();
	}
	/**
	 * InnerClass : 서버가 클라이언트가 보내온 데이터를 읽는 Thread
	 */
	class ServerRecive extends Thread{
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(sk.getInputStream()))){
				while(true) {
					String read = br.readLine();
					if(read.equals("exit")) {
						break;
					}
					System.out.println(read);  //모니터 출력
				}
				System.out.println("서버 받는 Thread 종료합니다");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("서버 프로그램 종료");
				System.exit(0);
			}
		}
	}
}
