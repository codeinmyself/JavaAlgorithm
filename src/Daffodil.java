/*
 * ��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ��
 * ��λ�������λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
 */
public class Daffodil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hh");
		MyMath mymath=new MyMath();
		for(int i=100;i<1000;i++){
			if(mymath.isDaffodil(i)==true)
				System.out.println(i);
		}
	

	}
}
class MyMath{
	public  boolean isDaffodil(int number){
		int s=0;
		int count=0;
		while(number!=0){
			s= number%10;
			count=count+s*s*s;
			number=number/10;
		}
		return count==number;
	}
}
