import java.util.Scanner;

public class Swap
{
		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter first number: ");

				int num1 = sc.nextInt();

				System.out.print("Enter Second number: ");
	
				int num2 = sc.nextInt();

				int temp = num1;

				num1 = num2;

				num2 = temp;

				System.out.print("After Swapping");

				System.out.print("\nFirst number = " + num1);

				System.out.print("\nSecond number = " + num2);
	
			}
}