package sphere;
import java.math.BigInteger;
public class Sum {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");			//����sumΪ�ܺ�
		for (int i=1,k=0;i<101;i++)						//i���ڼ�¼����1��2��3��������100��k������¼���ڲ�iֵ�Ľ׳˵Ļ�
		{
			BigInteger j = new BigInteger("1");			//����jΪ�׳˵�ֵ,ÿ��ѭ���Ŀ�ʼʱ��jֵ����Ϊ1
			k=0;										//ÿ��ѭ����ʼ����kֵΪ0
			do
			{
				k++;									
				j=j.multiply(BigInteger.valueOf(k));	//�൱��j=j*k
			} while (k<i);
			sum=sum.add(j);								//�൱��sum+=j
		}
		System.out.println("�׳�ֵ�ĺ�Ϊ��"+sum);
	}

}