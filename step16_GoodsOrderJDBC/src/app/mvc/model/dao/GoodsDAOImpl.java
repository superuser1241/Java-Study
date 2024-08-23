package app.mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.mvc.model.dto.Goods;
import app.mvc.util.DbManager;

public class GoodsDAOImpl implements GoodsDAO {

	@Override
	public List<Goods> goodsSelect() throws SQLException {
		  Connection con=null;
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  List<Goods> list = new ArrayList<>();
		 try {
		   con = DbManager.getConnection();
		   ps= con.prepareStatement("select * from goods order by goods_id");
	       rs = ps.executeQuery(); 
	        
	        while(rs.next()) {
	        	Goods goods  = new Goods(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
	        	list.add(goods);
	        }
      }finally {
      	DbManager.close(con, ps, rs);
      }
		return list;
		
	}

	@Override
	public Goods goodsSelectBygoodsId(String goodsId) throws SQLException{
		Connection con=null;
		  PreparedStatement ps=null;
		  ResultSet rs=null;
		  Goods goods =null;
		 try {
		   con = DbManager.getConnection();
		   ps= con.prepareStatement("select * from goods where goods_id=?");
		   ps.setString(1, goodsId);
	       rs = ps.executeQuery(); 
	        
	        if(rs.next()) {
	        	 goods  = new Goods(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
	        	
	        }
    }finally {
    	DbManager.close(con, ps, rs);
    }
		return goods;
	}

}
