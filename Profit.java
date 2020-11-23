package sphere;
import java.util.Scanner;
public class Profit {
	public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	int a1=in.nextInt();							//a1为利润值
	double a2=0;									//a2为奖金
//	System.out.print(a1);							//测试a1读取是否有误
	if (a1>1000000)									//利润大于100万
	{
		a2=39500+(a1-1000000)*0.01;
	}
	else if (a1>600000)								//利润大于60万
			{
				a2=33500+(a1-600000)*0.015;
			}
		else if (a1>400000)							//利润大于40万
					{
						a2=27500+(a1-400000)*0.03;
					}else if (a1>200000)			//利润大于20万
							{
								a2=17500+(a1-200000)*0.05;
							} else if (a1>100000)		//利润大于10万
									{
										a2=10000+(a1-100000)*0.075;
									}
									else
										{
										a2=a1*0.1;	//利润小于10万
										}
	System.out.println("利润为"+a1+"元时，收益为"+a2+"元");
	}
}