import java.util.Scanner;
public class Add_One{
	public static void main(String args[]){
		int num,rem,sum,carry=0,digit=0,place=1;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a 5 digit Number:");		
		num = sc.nextInt();

		while(num>0){
			rem=num%10;
			sum=rem+1+carry;

			if(sum==10){
				sum=0;
				carry=1;
			}
			else{
				carry=0;
			}
			
			digit=digit+sum*place;
			place=place*10;
			num=num/10;
		}
		
		System.out.println("Your Five Digit Number is : "+digit);
	}
}