package DAY1;

public class ReferenceTypes {
    public static void main(String[] args) {
        // Array (Reference type)
        int[] numbers = {1, 2, 3, 4, 5};

        // Object (Reference type)
        String message = "Hello, World!"; // String is a reference data type in Java as Strings are Object, it is stored in the heap memory, and a reference to that memory location is stored in the variable.

        // Printing the reference type values
        System.out.println("Array element: " + numbers[0]);
        System.out.println("String: " + message);
    }
}
