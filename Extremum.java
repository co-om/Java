package sphere;

import java.util.Scanner;

public class Extremum {
	public static void main(String[] args) {
	int [] num=new int [10];			//定义数组num
	int x=0;
	int min = 0;
	int max = 0;
	Scanner in= new Scanner(System.in);
	for (int i=0;i<10;i++)				//键入10个整数
	{
		x=in.nextInt();
		num[i]=x;
		if (min>=num[i])				//记录当前最小值
		{
			min=num[i];
		}
		if (max<=num[i])				//记录当前最大值
		{
			max=num[i];
		}
	}
	System.out.println("最小值："+min+"最大值："+max);
	}
}