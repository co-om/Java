package sphere;
import java.util.Scanner;
public class Sphere {
		public static void main(String[] args) {				//程序入口
		final double pi=3.14;
		System.out.print("请输入球体的半径:");
		Scanner a=new Scanner(System.in);
		float r=a.nextFloat();
		System.out.println("球体的体积是："+(pi*r*r*r*4/3));		//计算并打印球体体积
		
		}

}