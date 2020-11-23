package sphere;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一串字符:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();					//存放用户输入的字符串
		String s2;
		s2 = s1.toLowerCase();					//将用户输入的字符串转换为小写字符
		char [] ch1,ch2;
		ch1 = s1.toCharArray();					//字符串转换为字符数组
		ch2 = s2.toCharArray();
		for (int i=0;i<s1.length();i++)
		{
			if (ch1[i]>='a'&&ch1[i]<='z')		//找出用户输入字符串中的小写字符
//			if (s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				ch2[i]=(char) (ch1[i]-32);		//将小写字符转换为大写字符
//				ch2 [i]=String.valueOf(ch2[i]).toUpperCase();	//功能同上
			}
		}
		s2 = String.copyValueOf(ch2);			//字符数组转换为字符串，这样做不用遍历数组
		StringBuffer sb=new StringBuffer(s2);	//构建一个StringBuffer类的字符串内容同s2，因为reverse是StringBuffer类下的方法
		sb.reverse();							//字符串反转
		System.out.println("转换后字符串为："+sb);	
	}
}