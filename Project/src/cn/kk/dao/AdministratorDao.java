package cn.kk.dao;

import cn.kk.entity.Administrator;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */
public interface AdministratorDao {
	/**
	 * find by name and password
	 * @param name
	 * @param pwd
	 * @return
	 */
	Administrator find(String name,String pwd);
	/**
	 * set password
	 * @param ad
	 * @param pwd
	 * @return
	 */
	int setPwd(Administrator ad,String pwd);
}
