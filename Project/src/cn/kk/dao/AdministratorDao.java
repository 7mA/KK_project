package cn.kk.dao;

import cn.kk.entity.Administrator;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */
public interface AdministratorDao {
	Administrator find(String name,String pwd);
	Administrator setPwd(Administrator ad,String pwd);
}