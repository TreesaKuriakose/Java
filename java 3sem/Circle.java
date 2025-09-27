public class Circle {
    
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public static void main(String[] args) {
        
        Circle myCircle = new Circle();

        
        myCircle.radius = 5.0;
      
        double area = myCircle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}
