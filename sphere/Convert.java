package sphere;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ�:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();					//����û�������ַ���
		String s2;
		s2 = s1.toLowerCase();					//���û�������ַ���ת��ΪСд�ַ�
		char [] ch1,ch2;
		ch1 = s1.toCharArray();					//�ַ���ת��Ϊ�ַ�����
		ch2 = s2.toCharArray();
		for (int i=0;i<s1.length();i++)
		{
			if (ch1[i]>='a'&&ch1[i]<='z')		//�ҳ��û������ַ����е�Сд�ַ�
//			if (s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				ch2[i]=(char) (ch1[i]-32);		//��Сд�ַ�ת��Ϊ��д�ַ�
//				ch2 [i]=String.valueOf(ch2[i]).toUpperCase();	//����ͬ��
			}
		}
		s2 = String.copyValueOf(ch2);			//�ַ�����ת��Ϊ�ַ��������������ñ�������
		StringBuffer sb=new StringBuffer(s2);	//����һ��StringBuffer����ַ�������ͬs2����Ϊreverse��StringBuffer���µķ���
		sb.reverse();							//�ַ�����ת
		System.out.println("ת�����ַ���Ϊ��"+sb);	
	}
}