package db.view;

import java.util.List;

import db.dao.EmpDAO;
import db.dto.Emp;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("---------JDBC TEST---------");
		EmpDAO dao = new EmpDAO();
		
		//1. 사원이름 검색
		dao.selectByEname();	
		List<Emp> emp1 =dao.selectAll();
		for(Emp e : emp1) {
			System.out.println(e);
			
		}
		System.out.println("------------------------------------------");
		
		Emp emp2 =dao.selectByEmpno(7566);
		if(emp2==null) {
			System.out.println("찾는 사원이 없습니다");
		}
		else {
			System.out.println(emp2);
		}
		
		System.out.println("------------------------------------------");
		
		int re = dao.preparedInsert(new Emp(9000, "JUN", "IT", 5000, null));
		if(re>0) {
			System.out.println(re+"등록되었습니다");
		}
		else {
			System.out.println(re+"등록되지 않았습니다");
		}
	}

}
