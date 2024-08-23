package ex0731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutStreamExam {
	//byte 단위 파일 읽기
	FileInputStream fis;
	
	//byte 단위 파일 저장 = 쓰기 = 출력
	FileOutputStream fos;
	public FileInputOutStreamExam() {
		try {
			fis = new FileInputStream("src/ex0731/test.txt");
			/*while(true) {
				
				int i =fis.read();
				if(i==-1) {
					break;
				}
				System.out.println(i+ "="+ (char)i);
			}*/
		int len = fis.available(); //읽을 수 있는 byte수를 리턴해준다
		byte [] b = new byte[len];//한번에 들어있는 byte수 만큼 읽어오기
		
		int i = fis.read(b);
		System.out.println("i = "+i);
		System.out.println("b = "+b);

		
		//byte 배열을 하나의 String으로 변환
		String str = new String(b);
		System.out.println("str = "+str);
		System.out.println("파일읽기 End---------------------------");
		
		
		
		//파일에 저장하기
		fos = new FileOutputStream("src/ex0731/write.txt",true);
		fos.write(65);
		fos.write(32);
		fos.write(66);
		fos.write(13);
		fos.write(10);
		fos.write(70);
		
		String message = "배고파요!";
		fos.write(message.getBytes());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new FileInputOutStreamExam();
	}

}
