package sphere;
import java.util.Random;
import java.util.Scanner;
public  class Account {
	String name;
	String id;
	int balance;				//�˻����
	void cunkuan(int a)			//���
	{
		balance=balance+a;
	}
	void qukuan(int a)			//ȡ��
	{
		balance=balance-a;
	}
	int chaxun()				//��ѯ
	{
		return balance;
	}
	void sq()				//�����˺�id
	{
		double q;
		int i= (int)(Math.random()*10000);
		id = id.valueOf(i);
	}
	
	void serve ()			//�˺��ṩ�ķ���
	{
		System.out.println("��ѡ�����\n1����ѯ�˻����\n2�����\n3��ȡ��");
		Scanner in = new Scanner(System.in);
		int k ;
		switch ( k = in.nextInt())
		{
		case 1:
		{
			System.out.print("�˻���"+balance);break;
		}
		case 2:
		{
			System.out.print("����������");
			int n = in.nextInt();
			balance+=n;
			break;
		}
		case 3:
		{
			System.out.print("������ȡ����");
			int n = in.nextInt();
			balance-=n;
			break;
		}
		default:System.out.print("�������");break;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("�������˻�������");
			Scanner in = new Scanner(System.in);
			Account a = new Account();
			a.name=in.nextLine();
			a.sq();
			System.out.print("����룺");
			int i=in.nextInt();
			a.cunkuan(i);
			System.out.println("����˻�idΪ��"+a.id);
			
			System.out.print("�������˻�������");
			Scanner sc = new Scanner(System.in);
			Account  b= new Account();
			b.name=sc.nextLine();
			b.sq();
			System.out.println("����룺");
			i=sc.nextInt();
			b.cunkuan(i);
			System.out.println("����˻�idΪ��"+b.id);
			
		System.out.println("�������˻�id:");
		String l= in.next();
		if (l.equals(a.id))
		{
			a.serve();
		}else if (l.equals(b.id))
		{
			b.serve();
		}else{
			System.out.print("ϵͳ���޴�id");
		}
	}
		
		
	}