import java.util.Scanner;
public class Meter_to_Feet{
	public static void main(String args[]){
		float d;
		
		Scanner sc=new Scanner(System.in);		

		System.out.println("Enter the distance in meter:");
		d=sc.nextFloat();

		System.out.println("Distance in feet: "+ d*3.28084);

		sc.close();
	}
}