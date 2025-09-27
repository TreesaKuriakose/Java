import java.util.Scanner;

public class Test {
  static void checkAge(int age) {

    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
    
    } else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int userAge = sc.nextInt(); 

    checkAge(userAge);
  }
}
