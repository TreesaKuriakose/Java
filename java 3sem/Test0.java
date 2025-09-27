import java.util.Scanner;

public class Test0 {

  static int checkAge(int age) {
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
      return 1; 
    } else {
      System.out.println("Access granted - You are old enough!");
      return 0; 
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int userAge = sc.nextInt();

    int result = checkAge(userAge);
    System.out.println("Result: " + result);
  }
}
