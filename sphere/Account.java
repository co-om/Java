package sphere;
import java.util.Random;
import java.util.Scanner;
public  class Account {
	String name;
	String id;
	int balance;				//账户余额
	void cunkuan(int a)			//存款
	{
		balance=balance+a;
	}
	void qukuan(int a)			//取款
	{
		balance=balance-a;
	}
	int chaxun()				//查询
	{
		return balance;
	}
	void sq()				//申请账号id
	{
		double q;
		int i= (int)(Math.random()*10000);
		id = id.valueOf(i);
	}
	
	void serve ()			//账号提供的服务
	{
		System.out.println("请选择服务：\n1：查询账户余额\n2：存款\n3：取款");
		Scanner in = new Scanner(System.in);
		int k ;
		switch ( k = in.nextInt())
		{
		case 1:
		{
			System.out.print("账户余额："+balance);break;
		}
		case 2:
		{
			System.out.print("请输入存款金额");
			int n = in.nextInt();
			balance+=n;
			break;
		}
		case 3:
		{
			System.out.print("请输入取款金额");
			int n = in.nextInt();
			balance-=n;
			break;
		}
		default:System.out.print("输入错误");break;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("请输入账户姓名：");
			Scanner in = new Scanner(System.in);
			Account a = new Account();
			a.name=in.nextLine();
			a.sq();
			System.out.print("请存入：");
			int i=in.nextInt();
			a.cunkuan(i);
			System.out.println("你的账户id为："+a.id);
			
			System.out.print("请输入账户姓名：");
			Scanner sc = new Scanner(System.in);
			Account  b= new Account();
			b.name=sc.nextLine();
			b.sq();
			System.out.println("请存入：");
			i=sc.nextInt();
			b.cunkuan(i);
			System.out.println("你的账户id为："+b.id);
			
		System.out.println("请输入账户id:");
		String l= in.next();
		if (l.equals(a.id))
		{
			a.serve();
		}else if (l.equals(b.id))
		{
			b.serve();
		}else{
			System.out.print("系统中无此id");
		}
	}
		
		
	}