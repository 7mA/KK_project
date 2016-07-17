package cn.kk.dao;

import java.util.List;

import cn.kk.entity.Asset;
/**
 * 
 * @author Guo Deji
 * @create 2016-07-16
 */
public interface AssetDao {
	int add(Asset a); //add asset
	int update(Asset a); //update asset
	int delete(Asset a); //delete asset
	int addCategory(String subCtg,String ctg); //add Category(大类，小类)
	int deleteSubCategory(String subCtg); //delete SubCategory(小类)
	int deleteCategory(String ctg); //delete Category(大类)
	List<Asset> queryByCtg(String ctg); //query by Category
	List<Asset> queryBySubCtg(String subCtg); //query by SubCategory
	List<Asset> queryById(int id); //query by ID
	List<Asset> queryByUser(String user); //query by User
}
