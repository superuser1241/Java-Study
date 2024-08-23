package ex0731;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
	
	public BufferedFileCopyExam(String readFileName, String writeFileName) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			long start = System.nanoTime();
			
			//readFileName 파일을 읽어서 writeFileName에 저장
			bis = new BufferedInputStream(new FileInputStream(readFileName));
			bos = new BufferedOutputStream(new FileOutputStream(writeFileName));
			int i =0;
			while((i=bis.read()) != -1){
				bos.write(i);
			}
			long end = System.nanoTime();
			System.out.println("Buffered 사용할 경우: " + (end - start)+"ns");
			
			System.out.println("파일 복사");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(bis!=null)bis.close();
				if(bos!=null)bos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String readFileName = JOptionPane.showInputDialog("읽을 파일명?");
		String writeFileName = JOptionPane.showInputDialog("저장 할 파일명?");
		new BufferedFileCopyExam(readFileName,writeFileName);

	}

}
