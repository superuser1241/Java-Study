package ex0731;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardInputExam {
	public KeyboardInputExam() throws Exception{
		/*InputStream is = System.in;
		int i = is.read();   //1byte 읽기
		System.out.println(i+" = "+ (char)i);*/
		
		//byte단위를 Reader로 변환
		/*InputStreamReader isr = new InputStreamReader(System.in);
		int i = isr.read();
		System.out.println(i+" = "+ (char)i);*/
		
		//InputStreamReader --> BufferedReader로 변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		String str = br.readLine();
		System.out.println("str = "+str);
	}
	public static void main(String[] args) throws Exception{
		new KeyboardInputExam();
		
	}

}
