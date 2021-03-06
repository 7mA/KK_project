package cn.kk.dao;

import java.util.List;
import java.util.Set;

import cn.kk.entity.Administrator;
import cn.kk.entity.Asset;
import cn.kk.entity.Staff;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */

public interface StaffDao {
	/**
	 * lend asset
	 * @param s
	 * @param a
	 * @param ad
	 * @return
	 */
	int lend(Staff s,Asset a,Administrator ad);
	/**
	 * return asset
	 * @param a
	 * @return
	 */
	int returnAsset(Asset a);
}
