package ex0806.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	public ServerExam() {
		try(ServerSocket server = new ServerSocket(8000);) {
			while(true) {
				System.out.println("-----------------클라이언트 접속 대기중------------------");
				Socket sk = server.accept();  //클라이언트 접속 대기
				System.out.println(sk.getInetAddress()+"님 접속되었습니다");
				
				//접속한 클라이언트가 보내온 데이터를 읽기
				InputStream is = sk.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String data = br.readLine();
				System.out.println("클라이언트 :"+data);
				
				OutputStream os = sk.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true);
				pw.println("서버에 접속하신걸 환영합니다");
				
				sk.close();
				
				System.out.println();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ServerExam();
	}

}
