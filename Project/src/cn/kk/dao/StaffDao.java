package cn.kk.dao;

import java.util.List;

import cn.kk.entity.Administrator;
import cn.kk.entity.Asset;
import cn.kk.entity.Staff;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */

public interface StaffDao {
	int lend(Staff s,Asset a,Administrator ad); //lend asset
	int returnAsset(Asset a); //return asset
	List<Asset> findAsset(Staff s);  //find all assets being used by a certain user
}
