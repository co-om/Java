package sphere;
import java.util.Scanner;
public class Teilateral {
	int l;
	int w;
	int h;
	double s;
	int sum;
	double area()		//���������ε����
	{
		s=l*w*h;
		return s;
	}                 
	int perimeter()		//���������ε��ܳ�
	{
		sum=l+w+h;
		return sum;
	}
	Teilateral (int i,int j,int k)						//���캯��
	{
		l=i;
		w=j;
		h=k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������εĳ��Ϳ�");
		Scanner in = new Scanner(System.in);
		int i=in.nextInt();
		int j=in.nextInt();
		int k=in.nextInt();
		Teilateral a1 = new Teilateral(i,j,k);
		System.out.print("�����ε����Ϊ��"+a1.area()+"\n�����ε��ܳ�Ϊ��"+a1.perimeter());
	}

}

