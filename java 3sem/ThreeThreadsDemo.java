class NumberPrinter implements Runnable{
 private int number;
 
 public NumberPrinter(int number){
  this.number = number;
 }
 public void run(){
  System.out.println("count:" + number + "from" + Thread.currentThread().getName());
 }
}
public class ThreeThreadsDemo{
 public static void main(String[] args){
  Thread t1 = new Thread(new NumberPrinter(1), "Thread1");
  Thread t2 = new Thread(new NumberPrinter(2), "Thread2");
  Thread t3 = new Thread(new NumberPrinter(3), "Thread3");

  t1.start();
  t2.start();
  t3.start();
  System.out.println("main ends");

 }

}
