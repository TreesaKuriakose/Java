public class Student1{
 String name;
 int marks;

 Student1(){
    this.name="unknown";
    this.marks=0;
 }

 Student1(String name,int marks){
   this.name=name;
   this.marks=marks;
 }

 String calculategrade(){
  if (marks>=90){
    return "A";
  }else if (marks>=80){
    return "B";
  }else if (marks >= 70){
    return "C";
  }else if (marks>= 60){
    return "D";
  }else if (marks >= 50){
    return "E";
  }else {
    return "Fail";
  }
}
 void displayresult() {
   System.out.println("Name:" + this.name);
   System.out.println("marks:" + this.marks);
   System.out.println("Grade:" + calculategrade());

   }
 void displayresult(int newmarks) {
   this.marks=newmarks;
   System.out.println("updated mark");
   displayresult();
   }
 
 public static void main(String[] args){
   Student1 s1= new Student1();
   s1.displayresult();
   System.out.println("------------------------");
   
   Student1 s2 = new Student1("treesa",90);
   s2.displayresult();
   System.out.println("------------------------");


  s2.displayresult(89);
  }
}