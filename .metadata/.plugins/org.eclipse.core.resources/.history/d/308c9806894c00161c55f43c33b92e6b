package cn.kk.manage;

import java.util.List;

import cn.kk.dao.AssetDao;
import cn.kk.dao.AssetImpl;
import cn.kk.entity.Asset;

public class AssetManage {
	/**
	 * Asset DAO implement
	 */
	AssetDao assetdao=new AssetImpl();
	/**
	 * add asset
	 * @param a
	 * @return
	 */
	public int add(Asset a){
		return assetdao.add(a);
	}
	/**
	 * update asset
	 * @param a
	 * @return
	 */
	public int update(Asset a){
		return assetdao.update(a);
	}
	/**
	 * delete asset
	 * @param a
	 * @return
	 */
	public int delete(Asset a){
		return assetdao.delete(a);
	}
	/**
	 * add category or subCategory
	 * @param subCtg
	 * @param ctg
	 * @return
	 */
	public int addCategory(String subCtg,String ctg){
		return assetdao.addCategory(subCtg, ctg);
	}
	/**
	 * delete subCatrgory
	 * @param subCtg
	 * @return
	 */
	public int deleteSubCategory(String subCtg){
		return assetdao.deleteSubCategory(subCtg);
	}
	/**
	 * delete category
	 * @param ctg
	 * @return
	 */
	public int deleteCategory(String ctg){
		return assetdao.deleteCategory(ctg);
	}
	/**
	 * query by Category
	 * @param ctg
	 * @return
	 */
	public List<Asset> queryByCtg(String ctg){
		return assetdao.queryByCtg(ctg);
	}
	/**
	 * query by subCategory
	 * @param subCtg
	 * @return
	 */
	public List<Asset> queryBySubCtg(String subCtg){
		return assetdao.queryBySubCtg(subCtg);
	}
	/**
	 * query by ID
	 * @param id
	 * @return
	 */
	public Asset queryById(int id){
		return assetdao.queryById(id);
	}
	/**
	 * query by user
	 * @param user
	 * @return
	 */
	public List<Asset> queryByUser(String user){
		return assetdao.queryByUser(user);
	}
}
