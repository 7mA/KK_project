package cn.kk.dao;

import java.util.List;

import cn.kk.entity.Asset;
import cn.kk.entity.Staff;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */

public interface StaffDao {
	int lend(Staff s,Asset a);
	int returnAsset(Asset a);
	List<Asset> findAsset(Staff s);
}
