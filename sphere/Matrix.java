package sphere;
import java.util.Scanner;
public class Matrix {
	int a[] [];
	int[][] sum(int a1[][],int a2[][])
	{
		if (a1.length!=a2.length||a1[0].length!=a2[0].length)	//若两矩阵的行或列不等则跳出
		{
			System.out.print("两数组行列不相等，不可相加");
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
		System.out.println("请输入矩阵的大小：");
		Scanner in =new Scanner(System.in);
		int i=in.nextInt();			//读取用户将要输入的数组的大小
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
		s.p();						//打印矩阵		
	}
}
