package cn.kk.dao;

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
	int addCategory(String subCtg,String ctg); //add Category(���࣬С��)
	int deleteSubCategory(String subCtg); //delete SubCategory(С��)
	int deleteCategory(String ctg); //delete Category(����)
	void queryByCtg(String ctg); //query by Category
	void queryBySubCtg(String subCtg); //query by SubCategory
	void queryById(int id); //query by ID
	void queryByUser(String user); //query by User
}
