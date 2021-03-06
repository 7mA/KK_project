package cn.kk.manage;

import cn.kk.dao.StaffDao;
import cn.kk.dao.StaffImpl;
import cn.kk.entity.Administrator;
import cn.kk.entity.Asset;
import cn.kk.entity.Staff;

public class StaffManage {
	StaffDao staffdao=new StaffImpl();
	/**
	 * lend asset
	 * @param s
	 * @param a
	 * @param ad
	 * @return
	 */
	public int lend(Staff s, Asset a,Administrator ad){
		if(a.getState()==0 && a.getUser()==null){
			return staffdao.lend(s, a, ad);
		}else{
			return 0;
		}
	}
	/**
	 * return asset
	 * @param a
	 * @return
	 */
	public int returnAsset(Asset a){
		if(a.getUser()!=null){
			return staffdao.returnAsset(a);
		}else{
			return 0;
		}
	}
}
