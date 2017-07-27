/*
 * 判断101-200之间有多少个素数，并输出所有素数。 
 */
public class PrimeNumber {
	public static void main(String[]args){
		int primeNumber=0,index=0;
		int a[]=new int[100];
		for(int i=101;i<=200;i++){
			if(isPrime(i)==true){
				primeNumber++;
			a[index]=i;
			index++;
			}
		}
		System.out.println(primeNumber);
		for(int i=0;i<index;i++)
			System.out.println(a[i]);
	}
	
	public static boolean isPrime(int number){
		boolean primeflag=true;
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0){
				primeflag=false;
				break;
			}
		}
		return primeflag;
	}
}
