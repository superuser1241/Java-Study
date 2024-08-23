package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.dto.Room;
import db.dto.Student;
import db.dto.Subject;
import db.dto.Teacher;

public class StudentDAO implements StudentTeacherDAO {

	@Override
	public List<Student> getGenderByWomen() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String sql ="select * from student where sjumin like '%-2%'";
		
		List<Student> list = new ArrayList<>();
		
		try {
			con = DbManager.getConnection();
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				int studentNo = rs.getInt(1);
				String studentName = rs.getString(2);
				String studentJumin = rs.getString(3);
				String studentPhone= rs.getString(4);
				String studentAddr= rs.getString(5);
				String studentEmail= rs.getString(6);
				
				Student student = new Student(studentNo,
						studentName,
						studentJumin,
						studentPhone,
						studentAddr,
						studentEmail);
				list.add(student);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st, rs);
		}
		return list;
	}

	@Override
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="select * from teacher where ADDR like ?";
		
		List<Teacher> teaList = new ArrayList<>();
		
		try {
			con = DbManager.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, "%" + gu + "%");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				int teacherNo = rs.getInt(1);
				String teacherName=rs.getString(2);
				String teacherJumin=rs.getString(3);
				String teacherPhone=rs.getString(4);
				String teacherAddr = rs.getString(5);
				String teacherEmail=rs.getString(6);
				String sugangCode = rs.getString(7);
				
				Teacher teacher = new Teacher(teacherNo,
						teacherName,
						teacherJumin,
						teacherPhone,
						teacherAddr,
						teacherEmail,
						sugangCode);
				teaList.add(teacher);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps, rs);
		}
		return teaList;
	}

	@Override
	public Teacher getTeacherInfoBySubject(String subject) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="select * from teacher where sub_code = "
				+ "(select sub_code from sub where upper(subject) = upper(?))";
		
		Teacher teacher = null;
		
		try {
			con = DbManager.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, subject);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				int teacherNo = rs.getInt(1);
				String teacherName=rs.getString(2);
				String teacherJumin=rs.getString(3);
				String teacherPhone=rs.getString(4);
				String teacherAddr = rs.getString(5);
				String teacherEmail=rs.getString(6);
				String sugangCode = rs.getString(7);
				
				teacher = new Teacher(teacherNo,
														teacherName,
														teacherJumin,
														teacherPhone,
														teacherAddr,
														teacherEmail,
														sugangCode);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps, rs);
		}
		return teacher;
	}

	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//??????????????????
		String sql ="select * from v_teacher where 강사번호=?";
		
		Teacher teacher = null;
		
		try {
			con = DbManager.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, teacherNo);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				int tNum= rs.getInt(1);
				String teacherName=rs.getString(2);
				String sugangCode = rs.getString(3);
				
				
				String subjectName=rs.getString(4);
				Subject subject = new Subject();
				subject.setSubjectName(subjectName);
				
				int roomNo = rs.getInt(5);
				int roomCount=rs.getInt(6);
				Room room = new Room();
				room.setRoomNo(roomNo);
				room.setRoomCount(roomCount);
				
				teacher = new Teacher(teacherNo,
														teacherName,
														sugangCode,
														subjectName,
														roomCount,
														roomNo
														);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps, rs);
		}
		return teacher;
	}
}
