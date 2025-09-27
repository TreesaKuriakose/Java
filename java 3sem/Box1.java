class Box1 {
    int width, height;
    
    // Constructor name corrected to match class name
    Box1(int a, int b) {
        width = a;
        height = b;
    }

    void showDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box1 boxInstance = new Box1(5, 10);
        boxInstance.showDimensions();
    }
}
