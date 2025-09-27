public class WrapperDemo1 {
    public static void main(String[] args) {
        // Creating wrapper objects using constructors (Old way - discouraged now)
        Integer num1 = new Integer(10); // Deprecated in newer Java versions
        Double num2 = new Double(3.14);

        // Creating wrapper objects using valueOf() (Preferred way)
        Integer num3 = Integer.valueOf(20);
        Double num4 = Double.valueOf(6.28);

        // Printing wrapper objects
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // Converting wrapper objects back to primitives
        int intVal = num3.intValue();
        double doubleVal = num4.doubleValue();
        System.out.println("Primitive int value: " + intVal);
        System.out.println("Primitive double value: " + doubleVal);
    }
}

