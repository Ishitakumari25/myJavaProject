public class WrapperToPrimitive {
    public static void main(String[] args) {
        // Given Double object
        Double obj = new Double(45.67);

        // Convert to primitive double
        double d = obj.doubleValue();

        // Convert to int using casting
        int i = (int) d;

        // Print all values
        System.out.println("Wrapper Double object value: " + obj);
        System.out.println("Primitive double value: " + d);
        System.out.println("Primitive int value (after casting): " + i);
    }
}
