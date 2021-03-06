package cn.kk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.kk.entity.Asset;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-17
 */

public class AssetImpl extends BaseDao implements AssetDao{

	@Override
	public int add(Asset a) {
		// TODO Auto-generated method stub
		String sql="insert into asset (name,subCategory,model,worth,buyTime,state,[user],ps)"
				+ "values(?,?,?,?,?,?,?,?)";
		java.sql.Date time =java.sql.Date.valueOf(a.getBuyTime());
		Object[] param={a.getName(),a.getCategory(),a.getModel(),a.getWorth(),time,a.getState(),a.getUser(),a.getPs()};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int update(Asset a) {
		// TODO Auto-generated method stub
		String sql="update asset set name=?,subCategory=?,model=?,worth=?,buyTime=?,state=?,[user]=?,ps=? "
				+ "where id=?";
		java.sql.Date time =java.sql.Date.valueOf(a.getBuyTime());
		Object[] param={a.getName(),a.getCategory(),a.getModel(),a.getWorth(),time,a.getState(),a.getUser(),a.getPs(),a.getId()};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int delete(Asset a) {
		// TODO Auto-generated method stub
		String sql="select [user] from asset where id=?";
		Object[] param={a.getId()};
		ResultSet rs=this.executeQuery(sql, param);
		String user="";
		try {
			if(rs.next()){
				user=rs.getString("user");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null){
			return 0;
		}else{
			sql="delete from lend where assetid=?";
			this.executeUpdate(sql, param);
			sql="delete from asset where id=?";
			int num=this.executeUpdate(sql, param);
			return num;
		}
	}

	@Override
	public int addCategory(String subCtg, String ctg) {
		// TODO Auto-generated method stub
		String sql="insert into Category (subCategory,category)values(?,?)";
		Object[] param={subCtg,ctg};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int deleteSubCategory(String subCtg) {
		// TODO Auto-generated method stub
		String sql="select [user] from asset where subCategory=?";
		Object[] param={subCtg};
		ResultSet rs=this.executeQuery(sql, param);
		String user="";
		try {
			while(rs.next()){
				user=rs.getString("user");
				if(user!=null){
					return 0;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="select id from asset where subCategory=?";
		rs=this.executeQuery(sql, param);
		int assetid;
		try {
			while(rs.next()){
				assetid=rs.getInt("id");
				sql="delete from lend where assetid=?";
				Object[] param2={assetid};
				this.executeUpdate(sql, param2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql="delete from asset where subCategory=?";
		this.executeUpdate(sql, param);
		sql="delete from category where subCategory=?";
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int deleteCategory(String ctg){
		// TODO Auto-generated method stub
		String sql="select * from category where category=?";
		Object[] param={ctg};
		ResultSet rs=this.executeQuery(sql, param);
		try {
			sql="select [user] from asset where subCategory=?";
			while(rs.next()){
				Object[] param2={rs.getString("subCategory")};
				ResultSet rs2=this.executeQuery(sql, param2);
				String user="";
				while(rs2.next()){
					user=rs2.getString("user");
					if(user!=null){
						return 0;
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num=0;
		sql="select * from category where category=?";
		rs=this.executeQuery(sql, param);
		try {
			while(rs.next()){
				num+=deleteSubCategory(rs.getString("subCategory"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<Asset> queryByCtg(String ctg) {
		// TODO Auto-generated method stub
		String sql="select * from category where category=?";
		Object[] param={ctg};
		ResultSet rs=this.executeQuery(sql, param);
		List<Asset> as=new ArrayList();
		try {
			while(rs.next()){
				as.addAll(queryBySubCtg(rs.getString("subCategory")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return as;
	}

	@Override
	public List<Asset> queryBySubCtg(String subCtg) {
		// TODO Auto-generated method stub
		String sql="select * from asset where subCategory=?";
		Object[] param={subCtg};
		ResultSet rs=this.executeQuery(sql, param);
		List<Asset> as=new ArrayList();
		Asset a=null;
		try {
			while(rs.next()){
				a=new Asset();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setCategory(rs.getString("subCategory"));
				a.setModel(rs.getString("model"));
				a.setWorth(rs.getInt("worth"));
				java.sql.Date time=rs.getDate("buyTime");
				a.setBuyTime(time.toString());
				a.setState(rs.getInt("state"));
				a.setUser(rs.getString("user"));
				a.setPs(rs.getString("ps"));
				as.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return as;
	}

	@Override
	public Asset queryById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from asset where id=?";
		Object[] param={id};
		ResultSet rs=this.executeQuery(sql, param);
		Asset a=null;
		try {
			if(rs.next()){
				a=new Asset();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setCategory(rs.getString("subCategory"));
				a.setModel(rs.getString("model"));
				a.setWorth(rs.getInt("worth"));
				java.sql.Date time=rs.getDate("buyTime");
				a.setBuyTime(time.toString());
				a.setState(rs.getInt("state"));
				a.setUser(rs.getString("user"));
				a.setPs(rs.getString("ps"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public List<Asset> queryByUser(String user) {
		// TODO Auto-generated method stub
		String sql="select * from asset where [user]=?";
		Object[] param={user};
		ResultSet rs=this.executeQuery(sql, param);
		List<Asset> as=new ArrayList();
		Asset a=null;
		try {
			if(rs.next()){
				a=new Asset();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setCategory(rs.getString("subCategory"));
				a.setModel(rs.getString("model"));
				a.setWorth(rs.getInt("worth"));
				java.sql.Date time=rs.getDate("buyTime");
				a.setBuyTime(time.toString());
				a.setState(rs.getInt("state"));
				a.setUser(rs.getString("user"));
				a.setPs(rs.getString("ps"));
				as.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return as;
	}	
	
}
