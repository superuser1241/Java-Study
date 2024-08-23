package ex0801;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
	public ObjectLoadExam() {
		try(ObjectInputStream oos = new ObjectInputStream
				(new FileInputStream("src/ex0801/save.txt"))){
			Student st1 = (Student)oos.readObject();
			Student st2 = (Student)oos.readObject();
			System.out.println("st1 = "+st1);
			System.out.println("st2 = "+st2);
			
			System.out.println("-----------------List 복원------------------------");
			List<Student> list = (List<Student>)oos.readObject();
			for(Student st : list) {
				System.out.println(st);
			}
			
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		new ObjectLoadExam();
	}

}
