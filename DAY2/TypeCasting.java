package DAY2;
/*
 * Widening type casting  : 
 *    - In Java refers to the process of converting a smaller data type into a larger data type. 
 *    - This is done automatically by the Java compiler, and no explicit casting is required. 
 *    - Widening is safe because it does not lose any information; a smaller type can fit into a larger type without any risk of data loss.
 * 
 * Here are the main primitive data types in Java, arranged from smallest to largest:

    - byte (8 bits)
    - short (16 bits)
    - int (32 bits)
    - long (64 bits)
    - float (32 bits)
    - double (64 bits)

   -  Widening Casting Table
        Smaller Type	   Larger Type	     Example

        byte	           short	         short s = b;
        short	           int	             int i = s;
        int	               long	             long l = i;
        long	           float	         float f = l;
        float	           double	         double d = f;
 */

public class TypeCasting {
    public static void main(String[] args) {
        // Widening from byte to short
        byte byteValue = 10;
        short shortValue = byteValue; // Implicit widening
        System.out.println("Widened byte to short: " + shortValue);
        
        // Widening from short to int
        shortValue = 1000;
        int intValue = shortValue; // Implicit widening
        System.out.println("Widened short to int: " + intValue);
        
        // Widening from int to long
        intValue = 100000;
        long longValue = intValue; // Implicit widening
        System.out.println("Widened int to long: " + longValue);
        
        // Widening from long to float
        longValue = 123456789L;
        float floatValue = longValue; // Implicit widening
        System.out.println("Widened long to float: " + floatValue);
        
        // Widening from float to double
        floatValue = 10.5f;
        double doubleValue = floatValue; // Implicit widening
        System.out.println("Widened float to double: " + doubleValue);
    }
}
