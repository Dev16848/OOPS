import java.util.Scanner;
public class BMI{
	public static void main(String args[]){
		float h,w;
		
		Scanner sc=new Scanner(System.in);		

		System.out.println("Enter your Height in Inches:");
		h=sc.nextFloat();

		System.out.println("Enter your Weight in Pounds:");
		w=sc.nextFloat();

		h*=0.0254;
		w*=0.45359237;

		System.out.println("Your BMI is: "+ (w/(h*h)));

		sc.close();
	}
}