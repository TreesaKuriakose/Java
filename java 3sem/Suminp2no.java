import java.util.Scanner;

public class Suminp2no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
    }
}
