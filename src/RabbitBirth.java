/*
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ�������
 * ���º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣� 
 */

public class RabbitBirth {
	public static void main(String[] args){
		int month=1;
		for(int i=1;i<20;i++){
			System.out.println(FeiBoCount(month));
			month++;
		}
	}
	
	public static int FeiBoCount(int month){
		if(month==1||month==2)
			return 1;
		else
			return FeiBoCount(month-1)+FeiBoCount(month-2);
		
	}

}

