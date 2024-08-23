package ex0806.MultiChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerGUIChatExam {
	Socket sk;
	String userIp;
	List<ClientSocketThread> list = new ArrayList<>();
	
	public ServerGUIChatExam() {
		try(ServerSocket server = new ServerSocket(9000)){
			while(true) {
				System.out.println("클라이언트 접속 대기중.....");
				sk=server.accept();
				userIp = sk.getInetAddress().toString();
				System.out.println(userIp+"님 접속하셨습니다");
				
				//접속된 각 sk를 Thread로 만들어서 자료구조에 추가한다
				ClientSocketThread th = new ClientSocketThread();
				th.start();
				list.add(th);
				
				System.out.println("현재 접속 인원:" +list.size()+"명\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ServerGUIChatExam();
	}
	
	/**
	 * list에 있는 Thread를 조회해서 pw로 데이터 전송
	 */
	public void sendMessage(String message) {
		for(ClientSocketThread th : list) {
			th.pw.println(message);
		}
	}
	
	
	/**
	 * 클라이언트 Socket을 Thread로 만들어서 클라이언트가 보내오는 내용을 읽어
	 * 접속된 모든 클라이언트에게 데이터를 전송하는 Thread
	 */
	class ClientSocketThread extends Thread{
		BufferedReader br;
		PrintWriter pw;
		String nickName;
		
		@Override
		public void run() {
			
			try {
				//읽기
				br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				
				//보내기
				pw = new PrintWriter(sk.getOutputStream(),true);
				
				//대화명 읽을 준비
				nickName = br.readLine();
				
				//모든 user에 대화명 전달
				sendMessage("["+nickName+"]님 입장!!");
				
				String inputData = null;
				while((inputData = br.readLine()) != null) {
					//inputData를 list에 저장된 모든 user에 보내준다
					sendMessage("["+nickName+"]"+inputData);
				}
				
			}catch(Exception e) {
				//e.printStackTrace();
				//접속된 클라이언트를 list에서 제거
				list.remove(this);
				
				// 남아있는 모든 클라이언트에 알리기
				sendMessage("["+nickName+"] 님이 퇴장!!!");
				
				System.out.println("["+nickName+"]님 퇴장!!! | 현재 접속인원 = "+list.size()+"명");
			}
		}
	}
}
