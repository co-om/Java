package sphere;
import java.util.Scanner;
public class Matrix {
	int a[] [];
	int[][] sum(int a1[][],int a2[][])
	{
		if (a1.length!=a2.length||a1[0].length!=a2[0].length)	//����������л��в���������
		{
			System.out.print("���������в���ȣ��������");
			return a;
		}
		a = new int[a1.length][a1[0].length];
		for (int i=0;i<a1.length;i++)
		{
			for (int j=0;j<a1[i].length;j++)
			{
				a[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return a;
	}
	void p()
	{
		for (int i=0;i<a.length ;i++)
		{
			for (int j=0;j<a[i].length ;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������Ĵ�С��");
		Scanner in =new Scanner(System.in);
		int i=in.nextInt();			//��ȡ�û���Ҫ���������Ĵ�С
		int j=in.nextInt();
		int [][] a1,a2;
		a1 =new int[i][j];
		a2 =new int[i][j]; 
		Matrix s =new Matrix();
		for (int a=0;a<i;a++)
		{
			for (int b=0;b<j;b++)
			{
				a1[a][b]=(int)(Math.random()*10);
				a2[a][b]=(int)(Math.random()*10);
			}
		}
		s.sum(a1,a2);
		for (int a=0;a<a1.length ;a++)
		{
			for (int b=0;b<a1[a].length ;b++)
			{
				System.out.print(a1[a][b]+"\t");
			}
			System.out.print("\t\t\t");
			for (int b=0;b<a1.length+1 ;b++)
			{
				System.out.print(a2[a][b]+"\t");
			}
			System.out.println("\n");
		}
		s.p();						//��ӡ����		
	}
}
