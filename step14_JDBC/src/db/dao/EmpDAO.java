package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.dto.Emp;

public class EmpDAO {
	/**
	 * 사원 테이블에서 모든 사원 이름 조회
	 */
	public void selectByEname() {
		//로드, 연결, 실행, 닫기
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = DbManager.getConnection();
			st=con.createStatement();
			rs = st.executeQuery("SELECT ENAME FROM EMP");
			
		while(rs.next()) {
			String ename = rs.getString("ename");
			System.out.println(ename);
		}
		
		System.out.println("조회 완료------------------");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st, rs);
		}
		
	}
	
	/**
	 * 모든 사원 정보 조회하기
	 * select empno, ename,job,sal,hiredate,from emp
	 */
	public List<Emp> selectAll() {
		Connection con =null;
		Statement st =null;
		ResultSet rs = null;
		List<Emp> list = new ArrayList<>();
		
		try {
			con = DbManager.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select empno, ename,job,sal,hiredate from emp");
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				String hiredate = rs.getString("hiredate");
				
				Emp emp = new Emp(empno,ename,job,sal,hiredate);
				list.add(emp);
				
				
			}		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st, rs);
		}
		return list;
	}
	
	/**
	 * 사원번호에 해당하는 사원정보 조회
	 * select empno, ename,job,sal,hiredate,from emp where mpno=7654
	 */
	public Emp selectByEmpno(int empno) {
		Connection con =null;
		Statement st =null;
		ResultSet rs = null;
		String url = "select empno, ename,job,sal,hiredate from emp where empno="+empno;
		
		Emp emp =null;
		
		try {
			con = DbManager.getConnection();
			st=con.createStatement();
			rs=st.executeQuery(url);
			
			if(rs.next()==true) {
				emp = new Emp(rs.getInt(1),
						rs.getString(2), 
						rs.getString(3), 
						rs.getInt(4), 
						rs.getString(5));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st, rs);
		}
		return emp;
	}
	
	/**
	 * 사원등록
	 * insert into emp(empno,ename,job,sal,hiredate) values(9000,'JUN','IT',5000,sysdate);
	 */
	public int insert(Emp emp) {
		Connection con =null;
		Statement st =null;
		String sql = "insert into emp(empno,ename,job,sal,hiredate) "
				+ "values(9000,'JUN','IT',5000,sysdate)";
		int result=0;
		
		try {
			con = DbManager.getConnection();
			st=con.createStatement();
			result = st.executeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st);
		}
		return result;
	}
	
	
	public int preparedInsert(Emp emp) {
		Connection con =null;
		PreparedStatement ps =null;
		String sql = "insert into emp(empno,ename,job,sal,hiredate) "
				+ "values(?,?,?,?,sysdate)";
		int result=0;
		
		try {
			con = DbManager.getConnection();
			ps=con.prepareStatement(sql);
			
			//?가 있다면, ?의 순서대로 개수만큼 ps.setXxx(?index,값) 필요
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getSal());
			
			result = ps.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps);
		}
		return result;
	}

}
