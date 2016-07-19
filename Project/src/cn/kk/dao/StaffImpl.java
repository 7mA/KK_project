package cn.kk.dao;

import java.util.Calendar;

import java.util.List;
import java.util.Scanner;

import cn.kk.entity.Administrator;
import cn.kk.entity.Asset;
import cn.kk.entity.Staff;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-17
 */
public class StaffImpl extends BaseDao implements StaffDao{

	@Override
	public int lend(Staff s, Asset a,Administrator ad) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Usage:");
		String usage=input.next();
		System.out.println("P.s. information:");
		String ps=input.next();
		Calendar ca=Calendar.getInstance();
		StringBuffer sb=new StringBuffer(ca.get(Calendar.YEAR)+"-"+(ca.get(Calendar.MONTH)+1)+"-"
				+ca.get(Calendar.DATE));	
		java.sql.Date time =java.sql.Date.valueOf(sb.toString());
		String sql="insert into lend (assetId,lendTime,administrator,usage,ps)values(?,?,?,?,?)";
		Object[] param={a.getId(),time,ad.getName(),usage,ps};
		int num=this.executeUpdate(sql, param);
		sql="update asset set [user]=? where id=?";
		Object[] param2={s.getName(),a.getId()};
		this.executeUpdate(sql, param2);
		return num;
	}

	@Override
	public int returnAsset(Asset a) {
		// TODO Auto-generated method stub
		Calendar ca=Calendar.getInstance();
		StringBuffer sb=new StringBuffer(ca.get(Calendar.YEAR)+"-"+(ca.get(Calendar.MONTH)+1)+"-"
				+ca.get(Calendar.DATE));	
		java.sql.Date time =java.sql.Date.valueOf(sb.toString());
		String sql="update lend set returnTime=? where assetId=? and returnTime is null";
		Object[] param={time,a.getId()};
		int num=this.executeUpdate(sql, param);
		if(num!=0){
			sql="update asset set [user]=? where id=?";
			Object[] param2={null,a.getId()};
			this.executeUpdate(sql, param2);
		}	
		return num;
	}

}
