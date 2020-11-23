package sphere;
import java.math.BigInteger;
public class Sum {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");			//变量sum为总和
		for (int i=1,k=0;i<101;i++)						//i用于记录外层的1、2、3、、、、100，k用来记录在内层i值的阶乘的积
		{
			BigInteger j = new BigInteger("1");			//变量j为阶乘的值,每次循环的开始时将j值重置为1
			k=0;										//每次循环开始重置k值为0
			do
			{
				k++;									
				j=j.multiply(BigInteger.valueOf(k));	//相当于j=j*k
			} while (k<i);
			sum=sum.add(j);								//相当于sum+=j
		}
		System.out.println("阶乘值的和为："+sum);
	}

}