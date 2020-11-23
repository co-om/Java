package sphere;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("请输入摄氏温度：");
	Scanner a = new Scanner(System.in);			//读取用户输入值
			float c=a.nextFloat();
			float F=c*9/5+32;
			System.out.println(c+"摄氏度转换成华氏度为"+F);
	}

}