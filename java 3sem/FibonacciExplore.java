class FibonacciExplore{
  static int callCount = 0;

  static int fibonacci(int n){
    callCount++;

    if (n == 0){
      return 0;
    } else if (n == 1){
       return 1;
    } else {
       return fibonacci(n-1) + fibonacci(n-2);
    }
  }
 public static void main(String[] args){
   int n = 10;

   System.out.println("first" + n + "fibinocci nos:");
   
   for(int i = 0; i < n; i++){
     System.out.println(fibonacci(i)+ " ");
   }
  

System.out.println("\n\nTotal recursive calls" + callCount++);
}

}