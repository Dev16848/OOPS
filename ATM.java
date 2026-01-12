import java.util.Scanner;
public class ATM{
	public static void main(String args[]){
		
		int amount,d;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Amount:");
		amount=sc.nextInt();

		d=amount/100;
		amount%=100;

		System.out.println("Number of 100 notes:"+d);

		d=amount/50;
		amount%=50;

		System.out.println("Number of 50 notes:"+d);

		d=amount/10;
		amount%=10;

		System.out.println("Number of 10 notes:"+d);
		
		d=amount/5;
		amount%=5;

		System.out.println("Number of 5 notes:"+d);

		d=amount/2;
		amount%=2;

		System.out.println("Number of 2 notes:"+d);

		d=amount/1;

		System.out.println("Number of 1 notes:"+d);


		sc.close();
		
	}
}