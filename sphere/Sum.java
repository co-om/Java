package sphere;
import java.math.BigInteger;
public class Sum {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");		//变量sum为总和					
		BigInteger j = new BigInteger("1");			//变量j为阶乘的值
		int i=0;									//i用于阶乘值的增加
		do
		{
			i++;									
			j=j.multiply(BigInteger.valueOf(i));	//相当于j=j*i
			sum=sum.add(j);
		} while (i<100);
		System.out.println("阶乘值的和为："+sum);
	}

}