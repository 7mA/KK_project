package cn.kk.dao;

import java.util.List;

import cn.kk.entity.Asset;
import cn.kk.entity.Staff;

public class StaffImpl extends BaseDao implements StaffDao{

	@Override
	public int lend(Staff s, Asset a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int returnAsset(Asset a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Asset> findAsset(Staff s) {
		// TODO Auto-generated method stub
		return null;
	}

}
