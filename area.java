package sphere;
import java.util.Scanner;
public class area {
	public static void main(String[] args) {			//程序入口
	System.out.print("请输入矩形的长和宽：");
	Scanner a=new Scanner(System.in);					//输入长和宽
	float length=a.nextFloat();							//将长度转换成单精度类型
	float widh=a.nextFloat();							//将宽度转换成单精度类型
	System.out.println("矩形的周长是："+(length+widh)*2);	//计算并打印矩形周长
	System.out.println("矩形的面积是："+(length*widh));		//计算并打印矩形面积
	}
}