package sphere;
import java.util.Scanner;
public class area {
	public static void main(String[] args) {			//�������
	System.out.print("��������εĳ��Ϳ�");
	Scanner a=new Scanner(System.in);					//���볤�Ϳ�
	float length=a.nextFloat();							//������ת���ɵ���������
	float widh=a.nextFloat();							//�����ת���ɵ���������
	System.out.println("���ε��ܳ��ǣ�"+(length+widh)*2);	//���㲢��ӡ�����ܳ�
	System.out.println("���ε�����ǣ�"+(length*widh));		//���㲢��ӡ�������
	}
}