package sphere;
import java.util.Scanner;
public class Claassify {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ�:");
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();					//���ڴ���û�������ַ���
		String s2;									//���ڴ�Ÿ�������ת���ɵ��ַ������Ա��ڴ�ӡ���
		char [] ch1=new char[s1.length()];			//����û������ַ���ת������ַ�����
		char [] num = new char[s1.length()];
		char [] up = new char[s1.length()];
		char [] lower = new char[s1.length()];
		char [] t = new char[s1.length()];
		ch1 = s1.toCharArray();						//���ַ���ת�����ַ�������
		int n=0,A=0,a=0,k=0;						//nΪ�����ַ�������AΪ��д��ĸ������aΪСд��ĸ������kΪ��������
		for (int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>='0'&&ch1[i]<='9') 
			{
				num[n]=ch1[i];						//��¼������ĸ
				n++;								//ͳ�����ָ���	
			}
			else if(ch1[i]>='A'&&ch1[i]<='Z')
			{
				up[A]=ch1[i];						//��¼��д��ĸ
				A++;								//ͳ�ƴ�д��ĸ����
			}
			else if(ch1[i]>='a'&&ch1[i]<='z')
			{
				lower[a]=ch1[i];					//��¼Сд��ĸ
				a++;								//ͳ��Сд��ĸ����
			}
			else
			{
				t[k]=ch1[i];						//��¼�����ַ�
				k++;								//ͳ�������ַ�
			}
		}
		s2 = String.copyValueOf(num);				//��num����ת��Ϊ�ַ������Ա��ڴ�ӡʡȥ���������
		System.out.println("�����ַ�: "+s2+"\t������"+k);
		s2 = String.copyValueOf(up);				//��up����ת��Ϊ�ַ���
		System.out.println("��д��ĸ�ַ�: "+s2+"\t������"+A);
		s2 = String.copyValueOf(lower);				//��lower����ת��Ϊ�ַ���
		System.out.println("Сд��ĸ�ַ�: "+s2+"\t������"+a);
		s2 = String.copyValueOf(t);					//��t����ת��Ϊ�ַ���
		System.out.println("�����ַ�: "+s2+"\t������"+k);
	}
}