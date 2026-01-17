import java.util.Scanner;
public class Area_of_Triangle{
	public static void main(String args[]){
		int s1,s2,s3;
		double area,s;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Side 1: ");
		s1=sc.nextInt();

		System.out.println("Enter the value of Side 2: ");
		s2=sc.nextInt();

		System.out.println("Enter the value of Side 3: ");
		s3=sc.nextInt();

		
		if(s1+s2>s3&&s2+s3>s1&&s3+s1>s2){
			s=(s1+s2+s3)/2;
			area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
			System.out.println("Area of traingle : "+area);
		}
		else
			System.out.println("Error 101: Given Sides are not of a Traingle.");
	}
}