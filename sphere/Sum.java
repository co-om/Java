package sphere;
import java.math.BigInteger;
public class Sum {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");		//����sumΪ�ܺ�					
		BigInteger j = new BigInteger("1");			//����jΪ�׳˵�ֵ
		int i=0;									//i���ڽ׳�ֵ������
		do
		{
			i++;									
			j=j.multiply(BigInteger.valueOf(i));	//�൱��j=j*i
			sum=sum.add(j);
		} while (i<100);
		System.out.println("�׳�ֵ�ĺ�Ϊ��"+sum);
	}

}