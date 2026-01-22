import java.util.Scanner;
class Rectangle{

	double width,height;
	
	Rectangle(){
		width=1;
		height=1;
	}
	Rectangle(double w, double h){
		width=w;
		height=h;
	}
	
	void getArea(){
		System.out.println("Area of Rectangle:"+(width*height));
	}
	
	void getPerimeter(){
		System.out.println("Perimeter of Rectangle:"+(2*(width+height)));
	}

	public static void main(String args[]){
		Rectangle obj1 =new Rectangle();
		obj1.getArea();
		obj1.getPerimeter();
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the width of Rectangle:");
		int a=sc.nextInt();
		System.out.println("Enter the height of Rectangle:");
		int b=sc.nextInt();

		Rectangle obj2 =new Rectangle(a,b);
		obj2.getArea();
		obj2.getPerimeter();
		
	}
}