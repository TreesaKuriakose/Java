import java.util.Scanner;

public class Simple_Interest_Calculator
{
	public static void main(String[] args)
		{

			Scanner sc = new Scanner(System.in);

			System.out.println("Simple Interest calculator");

			System.out.println("--------------------------");

			System.out.println("Enter Principal amount: ");

			int principal_amount = sc.nextInt();

			System.out.println("\nEnter the Rate of interest per year (%): ");

			int rate = sc.nextInt();

			System.out.println("\nEnter the Time in years: ");

			int time = sc.nextInt();

			int simple_interest = (principal_amount * rate * time) / 100;
			
			System.out.println("\nSimple interest = " + simple_interest);

			

		}
}