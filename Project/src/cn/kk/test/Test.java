package cn.kk.test;
/**
 * 
 * @author Gu Lingmei
 * create 2016-7-16
 *
 */
import cn.kk.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Test test=new Test();
		Scanner input=new Scanner(System.in);
		ManagerLogin();
		
		System.out.println("Please choose function:");
		System.out.println("1.Modify password");
		System.out.println("2.Personnel information management");
		System.out.println("3.Fixed assets information management");
		System.out.println("4.Fixed assets using management");
		System.out.println("5.Exit system");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			test.ModPwd();
			break;
		case 2:
			test.PersonInfoManage();
			break;
		case 3:
			test.AssetInfoManage();
			break;
		case 4:
			test.AssetUseManage();
			break;
		default:
			System.out.println("Without this option!Please choose again!");
			//�������˵�
			break;
		}
	}
	public static void ManagerLogin(){
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to KK Fixed Assets Management System");
		System.out.println("If you're a management,please login.");
		//ʵ�ֹ���Ա��¼
		
	}
	public void ModPwd(){
		//������Ա��Ϣ
		//�������˵�
	}
	public void PersonInfoManage(){
		Scanner input=new Scanner(System.in);
		System.out.println("Please choose function:");
		System.out.println("1.Add personnel information");
		System.out.println("2.Delete personnel information");
		System.out.println("3.Modify personnel information");
		System.out.println("4.Show personnel information");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			break;
		case 2:
			//ɾ����Ա��Ϣ
			//�������˵�
			break;
		case 3:
			//�޸���Ա��Ϣ
			//�������˵�
			break;
		case 4:
			//��ʾ��Ա��Ϣ
			//�������˵�
			break;
		case 5:
			System.out.println("Thsnk you for using this system!");
			break;
		default:	
			System.out.println("Without this option!Please choose again!");
			//�������˵�
			break;
		}
	}
	public void AssetInfoManage(){
		Scanner input=new Scanner(System.in);
		System.out.println("Please choose function:");
		System.out.println("1.Add fixed assets category");
		System.out.println("2.Delete fixed assets category");
		System.out.println("3.Modify fixed assets category");
		System.out.println("4.Show fixed assets categories");
		System.out.println("5.Add fixed assets information");
		System.out.println("6.Delete fixed assets information");
		System.out.println("7.Modify fixed assets information");
		System.out.println("8.Show fixed assets information");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			//�����ʲ���
			//�������˵�
			break;
		case 2:
			//ɾ���ʲ���
			//�������˵�
			break;
		case 3:
			//�޸��ʲ���
			//�������˵�
			break;
		case 4:
			//��ʾ�ʲ����
			//�������˵�
			break;
		case 5:
			//�����ʲ���Ϣ
			//�������˵�
			break;
		case 6:
			//ɾ���ʲ���Ϣ
			//�������˵�
			break;
		case 7:
			//�޸��ʲ���Ϣ
			//�������˵�
			break;
		case 8:
			//��ʾ�ʲ���Ϣ
			//�������˵�
			break;
		default:
			System.out.println("Without this option!Please choose again!");
			//�������˵�
			break;
		}
	}
	public void AssetUseManage(){
		Scanner input=new Scanner(System.in);
		System.out.println("Please choose function:");
		System.out.println("1.Lend a fixed asset");
		System.out.println("2.Return a fixed asset");
		System.out.println("3.Inquire fixed assets ");
		System.out.println("4.Browse fixed assets using information");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			//�ʲ�����
			//�������˵�
			break;
		case 2:
			//�ʲ��黹
			//�������˵�
			break;
		case 3:
			//�ʲ���ѯ
			//�������˵�
			break;
		case 4:
			//����ʲ�ʹ�����
			//�������˵�
			break;
		default:
			System.out.println("Without this option!Please choose again!");
			//�������˵�
			break;
		}
	}
}
