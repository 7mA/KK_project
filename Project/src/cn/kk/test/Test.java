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
		Scanner input=new Scanner(System.in);
		
		System.out.println("Welcome to KK Fixed Assets Management System");
		System.out.println("If you're a management,please login.");
		//ʵ�ֹ���Ա��¼
		
		System.out.println("Please choose function:");
		System.out.println("1.Modify password");
		System.out.println("2.Personnel information management");
		System.out.println("3.Fixed assets information management");
		System.out.println("4.Fixed assets using management");
		System.out.println("5.Exit system");
		int choice=input.nextInt();
		switch(choice){
		case 1:
			//�޸�����
			//�������˵�
			break;
		case 2:
			System.out.println("Please choose function:");
			System.out.println("1.Add personnel information");
			System.out.println("2.Delete personnel information");
			System.out.println("3.Modify personnel information");
			System.out.println("4.Show personnel information");
			choice=input.nextInt();
			switch(choice){
			case 1:
				//������Ա��Ϣ
				//�������˵�
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
			break;
		case 3:
			System.out.println("Please choose function:");
			System.out.println("1.Add fixed assets category");
			System.out.println("2.Delete fixed assets category");
			System.out.println("3.Modify fixed assets category");
			System.out.println("4.Show fixed assets categories");
			System.out.println("5.Add fixed assets information");
			System.out.println("6.Delete fixed assets information");
			System.out.println("7.Modify fixed assets information");
			System.out.println("8.Show fixed assets information");
			choice=input.nextInt();
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
			break;
		case 4:
			System.out.println("Please choose function:");
			System.out.println("1.Lend a fixed asset");
			System.out.println("2.Return a fixed asset");
			System.out.println("3.Inquire fixed assets ");
			System.out.println("4.Browse fixed assets using information");
			choice=input.nextInt();
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
			break;
		default:
			System.out.println("Without this option!Please choose again!");
			//�������˵�
			break;
		}
	}
}
