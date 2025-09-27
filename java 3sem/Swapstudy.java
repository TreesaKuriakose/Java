import java.util.Scanner;

public class Swapstudy{
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  

  System.out.print("enter the no:");
  int a = sc.nextInt();
  System.out.print("enter the no:");
  int b= sc.nextInt();
  
  System.out.print("afr swap:");
  int temp = a;
  b = a;
  a = b;
  System.out.println("1st no is" + a);
  System.out.println("2st no is" + b);

   }
  }
}