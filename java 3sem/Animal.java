class Animal{
 void makeSound(){
   System.out.println("animal sounds");
 }
}
class Dog extends Animal{
  void makeSound(){
    System.out.println("bowwwwwwwww");
 }
}
class Cat extends Animal{
 void makeSound(){
  System.out.println("mewwwwwww");
 }
}
class Cow extends Animal{
 void makeSound(){
  System.out.println("immaaaaaaa");
 }
} 
public class AnimalDemo{
 public static void main(String[] args){
  Animal a1 = new Dog(); 
  Animal a2 = new Cat();
  Animal a3 = new Cow();
  a1.makeSound();
  a2.makeSound();
  a3.makeSound();

 } 

}
