
package cn.kk.test;
/**
 * 
 * @author Gu Lingmei
 * create 2016-7-16
 * modify by Gu Lingmei 2016-7-18
 */
import cn.kk.*;
import cn.kk.entity.Administrator;
import cn.kk.entity.Asset;
import cn.kk.entity.Staff;
import cn.kk.manage.AdministratorManage;
import cn.kk.manage.AssetManage;
import cn.kk.manage.StaffManage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to KK Fixed Assets Management System");
		System.out.println("If you're a manager,please login.");
		Administrator admin=ManagerLogin();
		Menu(admin);
	}
	public static void Menu(Administrator ad){
		System.out.println("Please choose function:");
		System.out.println("1.Modify password");
		System.out.println("2.Fixed assets information management");
		System.out.println("3.Fixed assets using management");
		System.out.println("4.Exit system");
		Test test=new Test();
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		switch(choice){
		case 1:
			test.ModPwd(ad);
			break;
		case 2:
			test.AssetInfoManage(ad);
			break;
		case 3:
			test.AssetUseManage(ad);
			break;
		case 4:
			System.out.println("Thank you for using this system!");
			break;
		default:
			System.out.println("Without this option!Please choose again!");
			test.Menu(ad);
			break;
		}
	}
	/**
	 * Manager login
	 */
	public static Administrator ManagerLogin(){
		//实现管理员登录
		AdministratorManage admin=new AdministratorManage();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name=input.next();
		System.out.println("Please enter your password.");
		String pwd=input.next();
		Administrator ad=admin.login(name,pwd);
		if(ad!=null){
			System.out.println("Login succeed.");
		}else{
			System.out.println("Login failed.Please login again.");
			ManagerLogin();
		}
		return ad;
	}
	/**
	 * Manager Modifies his password
	 */
	public void ModPwd(Administrator ad){
		//修改密码
		AdministratorManage admin=new AdministratorManage();
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your new password.");
		String pwd=input.next();
		admin.setPwd(ad, pwd);
		System.out.println("Modify new password succeed.");
		Menu(ad);
	}

	/**
	 * Fixed assets information management
	 */
	public void AssetInfoManage(Administrator ad){
		Scanner input=new Scanner(System.in);
		Asset a=new Asset();
		int id=0;
		String name=null;
		String model=null;
		String category=null;
		String subcategory=null;
		String buyTime=null;
		int state=-1;
		int worth=0;
		String user=null;
		String ps=null;
		AssetManage asset=new AssetManage();
		System.out.println("Please choose function:");
		System.out.println("1.Add fixed assets category");
		System.out.println("2.Delete fixed assets subcategory");
		System.out.println("3.Delete fixed assets category");
		System.out.println("4.Add fixed assets information");
		System.out.println("5.Delete fixed assets information");
		System.out.println("6.Modify fixed assets information");
		System.out.println("7.Inquiry assets information by subcategory");
		System.out.println("8.Inquiry assets information by category");
		System.out.println("9.Inquiry assets information by assets'id");
		System.out.println("10.Inquiry assets information by assets'user");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			//增加资产类		
			System.out.println("Please enter the subcategory you want add.");
			subcategory=input.next();
			System.out.println("Please enter the category the subcategory belongs to.");
			category=input.next();
			int num=asset.addCategory(subcategory,category);
			if(num==1){
				System.out.println("Add succeed.");
			}else{
				System.out.println("Add failed.");
			}
			Menu(ad);
			break;
		case 2:
			//删除资产小类
			System.out.println("Please enter the subcategory you want delete.");
			category=input.next();
			int num1=asset.deleteSubCategory(category);
			if(num1!=0){
				System.out.println("Delete subcategory succeed.");
			}else{
				System.out.println("Delete subcategory failed.");
			}
			Menu(ad);
			break;
		case 3:	
			//删除资产大类
			System.out.println("Please enter the category you want delete.");
			category=input.next();
			int num2=asset.deleteCategory(category);
			if(num2!=0){
				System.out.println("Delete category succeed.");
			}else{
				System.out.println("Delete category failed.");
			}
			Menu(ad);
			break;
		case 4:
			//增加资产信息
			System.out.println("Please enter the asset's name.");
			name=input.next();
			a.setName(name);
			System.out.println("Please enter the asset's subcategory.");
			subcategory=input.next();
			a.setCategory(subcategory);
			System.out.println("Please enter the asset's model.");
			model=input.next();
			a.setModel(model);
			System.out.println("Please enter the asset's worth.");
			worth=input.nextInt();
			a.setWorth(worth);
			System.out.println("Please enter the asset's buyTime.");
			buyTime=input.next();
			a.setBuyTime(buyTime);
			System.out.println("Please enter the asset's state.");
			System.out.println("Asset state: 0.normal 1.repairing 2.unusable.");
			state=input.nextInt();
			a.setState(state);
			System.out.println("If you have sth to remark,please enter the asset's ps else enter ' ' .");
			System.out.println("Please enter the asset's ps.");
			ps=input.next();
			a.setPs(ps);
			int num3=asset.add(a);
			if(num3!=0){
				System.out.println("Add asset succeed.");
			}else{
				System.out.println("Add asset failed.");
			}
			Menu(ad);
			break;
		case 5:
			//删除资产信息
			System.out.println("Please enter the asset's id which you want to delete.");
			id=input.nextInt();
			a.setId(id);
			int num4=asset.delete(a);
			if(num4==1){
				System.out.println("Delete asset succeed.");
			}else{
				System.out.println("Delete asset failed.");
			}
			Menu(ad);
			break;
		case 6:
			//修改资产信息
			System.out.println("Please enter the asset's id which you want to modify.");
			id=input.nextInt();
			a.setId(id);
			System.out.println("Please enter the asset's name.");
			name=input.next();
			a.setName(name);
			System.out.println("Please enter the asset's subcategory.");
			subcategory=input.next();
			a.setCategory(subcategory);
			System.out.println("Please enter the asset's model.");
			model=input.next();
			a.setModel(model);
			System.out.println("Please enter the asset's worth.");
			worth=input.nextInt();
			a.setWorth(worth);
			System.out.println("Please enter the asset's buyTime.");
			buyTime=input.next();
			a.setBuyTime(buyTime);
			System.out.println("Please enter the asset's state.");
			System.out.println("Asset state: 0.normal 1.repairing 2.unusable.");
			state=input.nextInt();
			a.setState(state);
			System.out.println("If you have sth to remark,please enter the asset's ps else enter ' ' .");
			System.out.println("Please enter the asset's ps.");
			ps=input.next();
			a.setPs(ps);		
			int num5=asset.update(a);
			if(num5==1){
				System.out.println("Modify asset succeed.");
			}else{
				System.out.println("Modify asset failed.");
			}
			Menu(ad);
			break;
		case 7:
			//通过小类查询资产
			System.out.println("Please enter the asset's subcategory which you want to inquiry.");
			subcategory=input.next();
			List<Asset> as=asset.queryBySubCtg(subcategory);
			for(Asset a1:as){
				a1.show();
			}
			if(as.isEmpty()){
				System.out.println("No result!");
			}
			Menu(ad);
			break;
		case 8:
			//通过大类查询资产
			System.out.println("Please enter the asset's category which you want to inquiry.");
			category=input.next();
			List<Asset> as1=asset.queryByCtg(category);
			for(Asset a1:as1){
				a1.show();
			}
			if(as1.isEmpty()){
				System.out.println("No result!");
			}
			Menu(ad);
			break;
		case 9:
			//通过id查询资产
			System.out.println("Please enter the asset's id which you want to inquiry.");
			id=input.nextInt();
			Asset a1=asset.queryById(id);
			if(a1!=null){
				a1.show();
			}else{
				System.out.println("No result!");
			}
			Menu(ad);
			break;
		case 10:
			//通过用户查询资产
			System.out.println("Please enter the asset's user which you want to inquiry.");
			user=input.next();
			List<Asset> as2=asset.queryByUser(user);
			for(Asset a2:as2){
				a2.show();
			}
			if(as2.isEmpty()){
				System.out.println("No result!");
			}
			Menu(ad);
			break;
		default:
			System.out.println("Without this option!");
			Menu(ad);
			break;
		}
	}
	/**
	 * Fixed assets using management
	 */
	public void AssetUseManage(Administrator ad){
		StaffManage staff=new StaffManage();
		Staff s=new Staff();
		Asset a=new Asset();
		String name=null;
		int id=0;
		Administrator admin=new Administrator();
		Scanner input=new Scanner(System.in);
		System.out.println("Please choose function:");
		System.out.println("1.Lend a fixed asset");
		System.out.println("2.Return a fixed asset");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			//资产领用		
			System.out.println("Who wants to lend assets?Please enter his name.");
			name=input.next();
			s.setName(name);
			System.out.println("Please enter asset's id.");
			id=input.nextInt();
			a.setId(id);
			AssetManage am=new AssetManage();
			a=am.queryById(id);
			if(a!=null){
				int num=staff.lend(s,a,ad);
				if(num!=0){
					System.out.println("Lend assets succeed.");
				}else{
					System.out.println("Lend assets failed.");
				}
			}else{
				System.out.println("Lend assets failed.");
			}
			Menu(ad);
			break;
		case 2:
			//归还资产
			System.out.println("Please enter asset's id which will be returned.");
			id=input.nextInt();
			a.setId(id);
			AssetManage am1=new AssetManage();
			a=am1.queryById(id);
			int num1=staff.returnAsset(a);
			if(num1!=0){
				System.out.println("Return assets succeed.");
			}else{
				System.out.println("Return assets failed.");
			}
			Menu(ad);
			break;
		default:
			System.out.println("Without this option!");
			Menu(ad);
			break;
		}
	}
}