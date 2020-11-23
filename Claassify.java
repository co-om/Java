package sphere;
import java.util.Scanner;
public class Claassify {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一串字符:");
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();					//用于存放用户输入的字符串
		String s2;									//用于存放各个数组转化成的字符串，以便于打印输出
		char [] ch1=new char[s1.length()];			//存放用户输入字符串转换后的字符数组
		char [] num = new char[s1.length()];
		char [] up = new char[s1.length()];
		char [] lower = new char[s1.length()];
		char [] t = new char[s1.length()];
		ch1 = s1.toCharArray();						//将字符串转换成字符串数组
		int n=0,A=0,a=0,k=0;						//n为数字字符个数，A为大写字母个数，a为小写字母个数，k为其他个数
		for (int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>='0'&&ch1[i]<='9') 
			{
				num[n]=ch1[i];						//记录数字字母
				n++;								//统计数字个数	
			}
			else if(ch1[i]>='A'&&ch1[i]<='Z')
			{
				up[A]=ch1[i];						//记录大写字母
				A++;								//统计大写字母个数
			}
			else if(ch1[i]>='a'&&ch1[i]<='z')
			{
				lower[a]=ch1[i];					//记录小写字母
				a++;								//统计小写字母个数
			}
			else
			{
				t[k]=ch1[i];						//记录其他字符
				k++;								//统计其他字符
			}
		}
		s2 = String.copyValueOf(num);				//将num数组转换为字符串，以便于打印省去了数组遍历
		System.out.println("数字字符: "+s2+"\t个数："+k);
		s2 = String.copyValueOf(up);				//将up数组转换为字符串
		System.out.println("大写字母字符: "+s2+"\t个数："+A);
		s2 = String.copyValueOf(lower);				//将lower数组转换为字符串
		System.out.println("小写字母字符: "+s2+"\t个数："+a);
		s2 = String.copyValueOf(t);					//将t数组转换为字符串
		System.out.println("其他字符: "+s2+"\t个数："+k);
	}
}