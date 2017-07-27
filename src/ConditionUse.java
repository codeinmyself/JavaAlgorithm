import java.util.Scanner;

public class ConditionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("input the score:");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		evaluate(score);
		sc.close();
		System.exit(0);
		
		
	}
	
	public static void evaluate(int score){
		String str=(score>90?"A":(score>60?"B":"C"));
		System.out.println(str);
	}

}
