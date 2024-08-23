package db.view;

import java.util.List;

import db.dao.StudentDAO;
import db.dto.Student;
import db.dto.Subject;
import db.dto.Teacher;

public class MainApp {
	public static void main(String[] args) {
		//1번 문제
		StudentDAO sd = new StudentDAO();
		
		List<Student> stList =sd.getGenderByWomen();
		for(Student e : stList) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------");
		//2번문제
		List<Teacher> teaList=sd.getTeacherInfoByAddr("강북구");
		for(Teacher e : teaList) {
			System.out.println(e);
		}
		
		
		System.out.println("--------------------------");
		//3번 문제
		Teacher teacher1 = sd.getTeacherInfoBySubject("sql");
		if(teacher1 !=null) {
			System.out.println(teacher1);
		}
		else System.out.println("과목명이 맞지 않습니다");
		
		
		
		System.out.println("--------------------------");
		//4번 문제
		Teacher teacher2 = sd.getTeacherInfoByNo(2);
		
		System.out.println(teacher2.getTeacherNo()+" "+teacher2.getTeacherName()+" "+
		teacher2.getSubject().getSugangCode()+" "+teacher2.getSubject().getSubjectName()+
		teacher2.getRoom().getRoomNo()+" "+teacher2.getRoom().getRoomCount());
	}

}
