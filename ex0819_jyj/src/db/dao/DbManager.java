package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB 연동을 위한 로드, 연결, 닫기
 */

public class DbManager {
	/**
	 * 로드
	 */
	static {
		try {
			Class.forName(DbProperties.DRIVER_NAME);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 연결
	 */
	public static Connection getConnection() throws SQLException{
		Connection con =DriverManager.getConnection(DbProperties.URL, 
																DbProperties.USER_ID, 
																DbProperties.USER_PASS);
		return con;
	}

	/**
	 * 닫기(DDL 또는 DML인 경우)
	 */
	public static void dbClose(Connection con, Statement st){
		try {
			if(st != null) st.close();
			if(con != null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 닫기(SELECT인 경우)
	 */
	public static void dbClose(Connection con, Statement st, ResultSet rs){
		try {
			if(rs != null) rs.close();
			dbClose(con,st);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	

}
