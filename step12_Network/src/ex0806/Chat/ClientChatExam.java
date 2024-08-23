package ex0806.Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {
	public ClientChatExam() {
		try {
			Socket sk = new Socket("127.0.0.1",8000);
			System.out.println("서버와 채팅 시작");
			
			//보내는 Thread
			new SendThread(sk, "Client").start();
			
			//받는 Thread
			new Thread(()->{
				try(BufferedReader br = new BufferedReader(
						new InputStreamReader(sk.getInputStream()))) {
					while(true) {
						String inputData = br.readLine();
						if(inputData.equals("exit"))break;
						
						System.out.println(inputData);
					}
					
					System.out.println("Client 받는 Thread 종료");
					
				} catch (Exception e) {
					//e.printStackTrace();
				}
				finally {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}).start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ClientChatExam();
	}

}
