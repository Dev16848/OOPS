import java.util.Scanner;
public class Cramers_Rule{
	public static void main(String args[]){
		int a,b,c,d,e,f,D,Dx,Dy,x,y;

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the value of coefficient a:");
		a=sc.nextInt();

		System.out.println("Enter the value of coefficient b:");
		b=sc.nextInt();
		
		System.out.println("Enter the value of coefficient c:");
		c=sc.nextInt();

		System.out.println("Enter the value of coefficient d:");
		d=sc.nextInt();

		System.out.println("Enter the value of coefficient e:");
		e=sc.nextInt();

		System.out.println("Enter the value of coefficient f:");
		f=sc.nextInt();

		
		D=a*d-b*c;
		
		if(D!=0){
			Dx=e*d-b*f;
			Dy=a*f-c*e;
			x=Dx/D;
			y=Dy/D;

			System.out.println("Value of x:"+x);
			System.out.println("Value of y:"+y);
		}
		else{
			System.out.println("The system has no unique solution.");
		}
		sc.close();
		
	}
}
