package sphere;
import java.util.Scanner;
public class Profit {
	public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	int a1=in.nextInt();							//a1Ϊ����ֵ
	double a2=0;									//a2Ϊ����
//	System.out.print(a1);							//����a1��ȡ�Ƿ�����
	if (a1>1000000)									//�������100��
	{
		a2=39500+(a1-1000000)*0.01;
	}
	else if (a1>600000)								//�������60��
			{
				a2=33500+(a1-600000)*0.015;
			}
		else if (a1>400000)							//�������40��
					{
						a2=27500+(a1-400000)*0.03;
					}else if (a1>200000)			//�������20��
							{
								a2=17500+(a1-200000)*0.05;
							} else if (a1>100000)		//�������10��
									{
										a2=10000+(a1-100000)*0.075;
									}
									else
										{
										a2=a1*0.1;	//����С��10��
										}
	System.out.println("����Ϊ"+a1+"Ԫʱ������Ϊ"+a2+"Ԫ");
	}
}