import java.util.Scanner;

public class PrimeDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("input the number:");
		int number=sc.nextInt();
		divide(number);
		sc.close();
	}

	public static void divide(int number){
		for(int i=2;i<=number/2;i++){
			while(number%i==0){
				number/=i;
				System.out.print(i+"*");
			}
		}
		System.out.print(number);
	}
	
}
