package DAY1;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 5000;
        int intVar = 100000;
        long longVar = 15000000000L;  // 'L' suffix indicates it's a long value

        float floatVar = 5.75f;       // 'f' suffix indicates it's a float value
        double doubleVar = 19.99d;    // 'd' suffix is optional for double values

        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);
    }
}
