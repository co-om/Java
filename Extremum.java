package sphere;

import java.util.Scanner;

public class Extremum {
	public static void main(String[] args) {
	int [] num=new int [10];			//��������num
	int x=0;
	int min = 0;
	int max = 0;
	Scanner in= new Scanner(System.in);
	for (int i=0;i<10;i++)				//����10������
	{
		x=in.nextInt();
		num[i]=x;
		if (min>=num[i])				//��¼��ǰ��Сֵ
		{
			min=num[i];
		}
		if (max<=num[i])				//��¼��ǰ���ֵ
		{
			max=num[i];
		}
	}
	System.out.println("��Сֵ��"+min+"���ֵ��"+max);
	}
}