package ex0731_jyj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise01 {
	public Exercise01() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0731_jyj/writeTest.txt",true));) {
			
			while(true) {
				String str = br.readLine();
				System.out.println("입력 = "+str);
				bw.write(str);
				bw.newLine();
				
				if(str.equals("exit")) {
					System.out.println("시스템을 종료합니다");
					break;
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Exercise01();
	}

}
