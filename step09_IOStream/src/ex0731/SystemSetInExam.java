package ex0731;

import java.io.FileInputStream;
import java.util.Scanner;

public class SystemSetInExam {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("src/ex0731/input.txt"));
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
		   String data = sc.nextLine();
		   System.out.println(data);
		}

	}

}
