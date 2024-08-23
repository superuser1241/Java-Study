package ex0801;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectSaveExam {
	public ObjectSaveExam() {
		//객체를 파일에 저장하고 싶다
		try(ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream("src/ex0801/save.txt"));){
			
			//저장
			Student st1 = new Student("영준1", 21 , "서울");
			Student st2 = new Student("영준2", 22 , "강남");
			
			List<Student> list = List.of(st1, st2, 
					new Student("영준3", 23 , "판교"), 
					new Student("영준4",24,"분당"));
			
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.writeObject(list);
			
			System.out.println("저장완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ObjectSaveExam();
	}

}
