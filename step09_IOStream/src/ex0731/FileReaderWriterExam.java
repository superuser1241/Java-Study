package ex0731;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterExam {
	
	public FileReaderWriterExam() {
		//문자단위로 File읽기 -> Buffered 이용
		//문자단위로 File저장 = 쓰기 -> Buffered 이용
		try(BufferedReader br = new BufferedReader(new FileReader("src/ex0731/test.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0731/writeTest.txt"))){
			
			/*while(true) {
				int i = br.read();  //한 문자 읽기(char)
				if(i ==-1)break;
				System.out.println(i+" = "+(char)i);
			}*/
			
			//한줄 읽기
			while(true) {
				String data = br.readLine();
				if(data == null) break;
					System.out.println(data);
			}
			
			//저장 = 쓰기 = 출력
			bw.write("오늘은 수요일!");
			bw.newLine();
			bw.write("재밌다");
			
			//bw.flush();    // 자동으로 close가 되는 상태이기 때문에 flush 사용 안해도 됨
			
			//BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0731/test1.txt"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new FileReaderWriterExam();
	}

}
