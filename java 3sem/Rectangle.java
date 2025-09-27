import java.util.Scanner;

public class Rectangle{

public static void main(String[] args)
{

	Scanner sc = new Scanner(System.in);

	System.out.print("enter the length of rectangle: ");
	
	int length = sc.nextInt();

	System.out.print("enter the breadth of rectangle: ");	

	int breadth = sc.nextInt();

	System.out.print("Area : "+ (length * breadth) );

	System.out.print("\nPerimeter : "+ 2*(length + breadth));

}
}