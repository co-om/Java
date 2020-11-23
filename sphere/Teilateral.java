package sphere;
import java.util.Scanner;
public class Teilateral {
	int l;
	int w;
	int h;
	double s;
	int sum;
	double area()		//计算三角形的面积
	{
		s=l*w*h;
		return s;
	}                 
	int perimeter()		//计算三角形的周长
	{
		sum=l+w+h;
		return sum;
	}
	Teilateral (int i,int j,int k)						//构造函数
	{
		l=i;
		w=j;
		h=k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入矩形的长和宽：");
		Scanner in = new Scanner(System.in);
		int i=in.nextInt();
		int j=in.nextInt();
		int k=in.nextInt();
		Teilateral a1 = new Teilateral(i,j,k);
		System.out.print("三角形的面积为："+a1.area()+"\n三角形的周长为："+a1.perimeter());
	}

}

