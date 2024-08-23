package ex0806.Net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
	public ClientExam() {
		try(Socket client = new Socket("192.168.0.22", 8000)){
			// 서버에게 데이터를 전송
			PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
			pw.println("서버에 접속하고싶어요!");
			
			//서버가 보내온 데이터 읽기
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String data = br.readLine();
			System.out.println("서버:"+ data);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ClientExam();
	}

}
