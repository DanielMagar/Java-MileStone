package DAY1;
/*
 * Data Types in Java : data types specify the size and type of values that can be stored in a variable.
 * Java's data types are categorized into - 
 *   1.primitive types and 
 *   2.Reference types
 * Defination-
 *  # Primitive Data Types : 
 *     - Primitive types are the most basic data types in Java.
 *     - There are 8 primitive data types.
 *     - These types are not objects and are stored in the stack memory, which makes them faster.
 *      i) byte	: 
 *         Size : 1 byte; 
 *         Default Value: 0; 
 *         Description: Stores whole numbers from -128 to 127 (useful for saving memory in large arrays).
 *     ii) short : 	
 *         Size : 2 bytes	
 *         Default Value: 0	
 *         Description: Stores whole numbers from -32,768 to 32,767.
 * 
 *    iii) int : 		
 *         Size : 4 bytes	
 *         Default Value: 0	
 *         Description: Stores whole numbers from -2^31 to 2^31-1. It is the default choice for integer values.
 * 
 *  *  iv) long : 		
 *         Size : 8 bytes	
 *         Default Value: 0L
 *         Description:   Stores whole numbers from -2^63 to 2^63-1. Use this when you need a wider range than int.
 * 
 *     v)  float : 		
 *         Size : 4 bytes	
 *         Default Value: 0.0f
 *         Description:   Stores single-precision 32-bit floating point numbers (decimal numbers). Suitable for saving memory in large arrays of floating point numbers.
 * 
 *     vi) double : 		
 *         Size : 8 bytes	
 *         Default Value: 0.0d
 *         Description:   Stores double-precision 64-bit floating point numbers. It's the default choice for decimal values in Java.
 * 
 *    vii) char : 		
 *         Size : 2 bytes	
 *         Default Value: '\u0000'
 *         Description:   stores a single 16-bit Unicode character (e.g., 'a', 'B', '3').
 *   
 *   viii) boolean : 		
 *         Size : 1 bit	
 *         Default Value: false
 *         Description:   Stores one of two values: true or false. It is used for simple flags that track true/false conditions.
 * 
 * # Reference Data Types: 
 *      i) Classes: Any object instantiated from a class is a reference type.
 *     ii) Interfaces: Interfaces define methods that can be implemented by classes. The variables that refer to interfaces are reference types.
 *    iii) Arrays: Arrays are objects in Java and are reference types.
 * 
 * # Reference Types Characteristics:
    - Reference types store the address of the object they refer to, not the actual value.
    - The default value of reference variables is null.
    - They can be used to call methods to perform operations. 
 * 
 */

 // NOTE : Please refert to PrimitiveTypes.java and ReferenceTypes.java first before this 
public class DataTypes {
    // A method to modify primitives
    public static void modifyPrimitives(int number, char letter) {
        number += 5; // Changing number won't affect the original value in the main method
        letter = 'Z'; // Changing letter won't affect the original value in the main method
    }

    // A method to modify reference types
    public static void modifyReferenceTypes(int[] arr, StringBuilder str) {
        arr[0] = 99; // Changing array will affect the original array in the main method
        str.append(" World"); // Changing StringBuilder will affect the original StringBuilder in the main method
    }

    public static void main(String[] args) {
        // Demonstrating Primitive Data Types
        int primitiveInt = 10;
        char primitiveChar = 'A';

        System.out.println("Before modifying primitives:");
        System.out.println("primitiveInt = " + primitiveInt);
        System.out.println("primitiveChar = " + primitiveChar);

        // Calling method to modify primitive values
        modifyPrimitives(primitiveInt, primitiveChar);

        // Primitives remain unchanged because they are passed by value
        System.out.println("After modifying primitives:");
        System.out.println("primitiveInt = " + primitiveInt);   // Still 10
        System.out.println("primitiveChar = " + primitiveChar); // Still 'A'

        // Demonstrating Reference Data Types
        int[] referenceArray = {1, 2, 3};
        StringBuilder referenceStringBuilder = new StringBuilder("Hello");

        System.out.println("\nBefore modifying reference types:");
        System.out.println("referenceArray[0] = " + referenceArray[0]);
        System.out.println("referenceStringBuilder = " + referenceStringBuilder);

        // Calling method to modify reference values
        modifyReferenceTypes(referenceArray, referenceStringBuilder);

        // References are changed because they are passed by reference
        System.out.println("After modifying reference types:");
        System.out.println("referenceArray[0] = " + referenceArray[0]);             // Changed to 99
        System.out.println("referenceStringBuilder = " + referenceStringBuilder);   // Changed to "Hello World"
    }
}
