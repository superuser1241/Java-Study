package ex0731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopyExam {
	
	public FileCopyExam(String readFileName, String writeFileName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			long start = System.nanoTime();
			
			//readFileName 파일을 읽어서 writeFileName에 저장
			fis = new FileInputStream(readFileName);
			fos = new FileOutputStream(writeFileName);
			int i =0;
			while((i=fis.read()) != -1){
				fos.write(i);
			}
			long end = System.nanoTime();
			System.out.println("Buffered 없는 경우: " + (end - start)+"ns");
			
			System.out.println("파일 복사");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String readFileName = JOptionPane.showInputDialog("읽을 파일명?");
		String writeFileName = JOptionPane.showInputDialog("저장 할 파일명?");
		new FileCopyExam(readFileName,writeFileName);

	}

}
