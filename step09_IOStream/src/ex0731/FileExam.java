package ex0731;

import java.io.File;

import javax.swing.JOptionPane;

public class FileExam {
	public FileExam()  throws Exception{
		String filePath = JOptionPane.showInputDialog("파일 경로는?");
		System.out.println(filePath);
		
		File file = new File(filePath);          // 절대경로 ->C:/Edu or 현재 프로젝트 기준
		if(file.exists()) {
			if(file.isDirectory()) {
				System.out.println(filePath+"폴더 정보 입니다");
				String fnames [] = file.list();
				for(String name : fnames) {
					System.out.println(name);
				}
				System.out.println("-----------------------------");
			}
			else {
				System.out.println(filePath+"파일 정보 입니다");
				System.out.println("file.canRead() = "+file.canRead());
				System.out.println("file.canWrite() = "+file.canWrite());
				System.out.println("file.getName() = "+file.getName());
				System.out.println("file.getAbsolutePath() = "+file.getAbsolutePath());
				System.out.println("file.length() = "+file.length());
			}
		}
		else {
			System.out.println("없으니 만들겠습니다");
			//파일 or 폴더 생성
			file.createNewFile();
			//file.mkdir();
		}
	}
	public static void main(String[] args) throws Exception{
		new FileExam();
	}

}
