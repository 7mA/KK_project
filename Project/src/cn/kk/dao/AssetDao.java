package cn.kk.dao;

import java.util.List;

import cn.kk.entity.Asset;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */
public interface AssetDao {
	/**
	 * add asset
	 * @param a
	 * @return
	 */
	int add(Asset a);
	/**
	 * update asset
	 * @param a
	 * @return
	 */
	int update(Asset a); 
	/**
	 * delete asset
	 * @param a
	 * @return
	 */
	int delete(Asset a); 
	/**
	 * add Category(大类，小类)
	 * @param subCtg
	 * @param ctg
	 * @return
	 */
	int addCategory(String subCtg,String ctg); 
	/**
	 * delete SubCategory(小类)
	 * @param subCtg
	 * @return
	 */
	int deleteSubCategory(String subCtg); 
	/**
	 * delete Category(大类)
	 * @param ctg
	 * @return
	 */
	int deleteCategory(String ctg); 
	/**
	 * query by Category
	 * @param ctg
	 * @return
	 */
	List<Asset> queryByCtg(String ctg); 
	/**
	 * query by SubCategory
	 * @param subCtg
	 * @return
	 */
	List<Asset> queryBySubCtg(String subCtg); 
	/**
	 * query by ID
	 * @param id
	 * @return
	 */
	Asset queryById(int id); 
	/**
	 * query by User
	 * @param user
	 * @return
	 */
	List<Asset> queryByUser(String user);
}
