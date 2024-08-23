package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
	public void transfer(String inputAccount, String outputAccount, int money) {
		Connection con =null;
		try {
			con = DbManager.getConnection();
			con.setAutoCommit(false);      //////////////// 제일 중요한 부분
			
			//인출하기
			int result = this.withdraw(con, outputAccount, money);
			if(result==0) throw new SQLException("출금계좌번호 오류입니다");
			
			//입금하기
			result = this.deposite(con, inputAccount, money);
			if(result == 0) throw new SQLException("입금계좌번호 오류입니다");
			
			//금액확인
			if( !this.isCheckBalance(con, inputAccount)) {
				throw new SQLException("잔액이 1000원을 초과하여 계좌이체를 할 수 없습니다");
			}
			
			//최종 커밋
			con.commit();
			System.out.println("계좌이체를 성공하였습니다");
			
		}catch(SQLException e) {
			//취소처리(롤백)
			try {
				con.rollback();
			}catch(SQLException sq) {
				sq.printStackTrace();
			}
			System.out.println(e.getMessage());
		}finally {
			DbManager.dbClose(con, null);
		}
	}
	/**
	 * 인출하기
	 */
	public int withdraw(Connection con,String outputAccount, int money) throws SQLException{
		String sql = "update bank set balance = balance - ? where account = ?";
		PreparedStatement ps=null;
		int result=0;
		try {
			con.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, outputAccount);
			
			result = ps.executeUpdate();
			
		}finally {
			DbManager.dbClose(null, ps);
		}
		return result;
	}
	/**
	 * 입금하기
	 * */
	public int deposite(Connection con,String inputAccount, int money)throws SQLException{
		String sql = "update bank set balance = balance - ? where account = ?";
		PreparedStatement ps=null;
		int result=0;
		try {
			con.prepareStatement(sql);
			ps.setInt(1, money);
			ps.setString(2, inputAccount);
			
			result = ps.executeUpdate();
			
		}finally {
			DbManager.dbClose(null, ps);
		}
		return result;
	}
	/**
	 * 잔액 조회하기(1000 이상이면 false, 아니면 true 리턴)
	 */
	public boolean isCheckBalance(Connection con, String inputAccount) throws SQLException{
		String sql = "select balance from bank where account = ?";
		PreparedStatement ps=null;
		ResultSet rs = null;
		boolean result = false;
		
		try {
			con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				if(rs.getInt(1)<=1000) 	return true;
			}
		}finally {
			DbManager.dbClose(null, ps, rs);
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
		//dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		System.out.println("--2. 입금계좌 오류----");
		//dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
		//dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		System.out.println("--4. 성공----------");
		//dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











