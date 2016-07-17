package cn.kk.manage;

import cn.kk.dao.AdministratorDao;
import cn.kk.dao.AdministratorImpl;
import cn.kk.entity.Administrator;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-17
 */

public class AdministratorManage {
	/**
	 * Administrator DAO implement
	 */
	AdministratorDao admindao=new AdministratorImpl();
	
	/**
	 * login
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Administrator login(String name,String pwd){
		return admindao.find(name, pwd);
	}
	/**
	 * set password
	 * @param ad
	 * @param pwd
	 * @return
	 */
	public int setPwd(Administrator ad,String pwd){
		return admindao.setPwd(ad, pwd);
	}
}
