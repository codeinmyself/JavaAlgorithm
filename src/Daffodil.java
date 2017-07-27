/*
 * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个
 * 三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
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
