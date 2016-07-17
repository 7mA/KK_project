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
		Object[] param={a.getName(),a.getCategory(),a.getModel(),a.getWorth(),time,a.getUser(),a.getPs()};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int update(Asset a) {
		// TODO Auto-generated method stub
		String sql="update asset set name=?,subCategory=?,model=?,worth=?,buyTime=?,state=?,[user]=?,ps=? "
				+ "where id=?";
		java.sql.Date time =java.sql.Date.valueOf(a.getBuyTime());
		Object[] param={a.getName(),a.getCategory(),a.getModel(),a.getWorth(),time,a.getUser(),a.getPs()};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int delete(Asset a) {
		// TODO Auto-generated method stub
		String sql="delete from asset where id=?";
		Object[] param={a.getId()};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int addCategory(String subCtg, String ctg) {
		// TODO Auto-generated method stub
		String sql="insert into Category (subCatrgory,catogory)values(?,?)";
		Object[] param={subCtg,ctg};
		int num=this.executeUpdate(sql, param);
		return num;
	}

	@Override
	public int deleteSubCategory(String subCtg) {
		// TODO Auto-generated method stub
		String sql="delete from asset where subCategory=?";
		Object[] param={subCtg};
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
		int num=0;
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
				a.setUser(rs.getString("[user]"));
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
				a.setUser(rs.getString("[user]"));
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
				a.setUser(rs.getString("[user]"));
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
