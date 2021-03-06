package cn.kk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.kk.entity.Administrator;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-17
 */

public class AdministratorImpl extends BaseDao implements AdministratorDao{
	
	@Override
	public Administrator find(String name, String pwd) {
		// TODO Auto-generated method stub
		String sql="select * from administrator where username=? and password=?";
		Object[] param={name,pwd};
		ResultSet rs=this.executeQuery(sql, param);
		Administrator ad=null;
		try {
			if(rs.next()){
				ad=new Administrator();
				ad.setId(rs.getInt("id"));
				ad.setName(rs.getString("username"));
				ad.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ad;
	}

	@Override
	public int setPwd(Administrator ad, String pwd) {
		// TODO Auto-generated method stub
		String sql="update administrator set password=? where id=?";
		Object[] param={pwd,ad.getId()};
		int num=this.executeUpdate(sql, param);
		return num;
	}
	
}
