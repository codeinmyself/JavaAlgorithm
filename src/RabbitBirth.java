/*
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四
 * 个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 
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

