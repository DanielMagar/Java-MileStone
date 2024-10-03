package DAY3;

/* Q. What are Java Operators? 
 *  - Java operators are special symbols or keywords used to perform operations on variables and values. 
 *  - Java provides a rich set of operators to manipulate data types. 
 *  - These operators are categorized based on their function.
 * 
 * #Categories of Java Operators: 
 *  1. Arithmetic Operators
 *  2. Relational (Comparison) Operators
 *  3. Logical Operators
 *  4. Bitwise Operators
 *  5. Assignment Operators
 *  6. Unary Operators
 *  7. Ternary (Conditional) Operator
 *  8. Instanceof Operator
 *  9. Type Cast Operators
 *  10. Shift Operators
 */
public class JavaOperators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators STARTS here -------------------------:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus - Modulus will print only remainders

        System.out.println("Arithmetic operators ENDS here:---------------------------");

        // 2. Relational Operators
        System.out.println("\nRelational Operators STARTS here -------------------------:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println("Relational Operators ENDS here:---------------------------");

        // 4. Bitwise Operators
        int c = 6; // Binary: 110
        int d = 4; // Binary: 100
        System.out.println("\nBitwise Operators STARTS here -------------------------:");
        System.out.println("c & d: " + (c & d)); // Bitwise AND
        System.out.println("c | d: " + (c | d)); // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
        System.out.println("~c: " + (~c)); // Bitwise NOT
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("c >> 1: " + (c >> 1)); // Right shift
        System.out.println("c >>> 1: " + (c >>> 1)); // Unsigned right shift
        System.out.println("Bitwise Operators ENDS here -------------------------:");

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators STARTS here -------------------------:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
        System.out.println("Logical Operators ENDS here:---------------------------");

        // 5. Assignment Operators
        int e = 10;
        System.out.println("\nAssignment Operators STARTS here -------------------------:");
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 5; // e = e - 5
        System.out.println("e -= 5: " + e);
        e *= 5; // e = e * 5
        System.out.println("e *= 5: " + e);
        e /= 5; // e = e / 5
        System.out.println("e /= 5: " + e);
        e %= 5; // e = e % 5
        System.out.println("e %= 5: " + e);
        System.out.println("Assignment Operators ENDS here:---------------------------");

        // 6. Unary Operators
        System.out.println("\nUnary Operators STARTS here -------------------------:");
        int f = 10;
        System.out.println("f++: " + (f++)); // Post-increment
        System.out.println("f: " + (f)); // Post-increment
        System.out.println("++f: " + (++f)); // Pre-increment
        System.out.println("f--: " + (f--)); // Post-decrement
        System.out.println("--f: " + (--f)); // Pre-decrement
        System.out.println("Unary Operators ENDS here:---------------------------");

        // 7. Ternary Operator
        System.out.println("\nTernary Operator STARTS here -------------------------:");
        int min = (a < b) ? a : b; // Returns the smaller of a and b
        System.out.println("The smaller value between a and b is: " + min);
        System.out.println("Ternary Operators ENDS here:---------------------------");

        // 8. Instanceof Operator
        System.out.println("\nInstanceof Operator  STARTS here -------------------------:");
        String str = "Hello, Java!";
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("TInstanceof Operators ENDS here:---------------------------");

        // 9. Type Cast Operator
        System.out.println("\nType Cast Operator STARTS here -------------------------:");
        double g = 9.78;
        int h = (int) g; // Explicit type casting from double to int
        System.out.println("Casting double 9.78 to int: " + h);
        System.out.println("Type Cast Operators ENDS here:---------------------------");

        // 9. Shift operators
        System.out.println("\nShift Operator STARTS here -------------------------:");
        int num = 8; // Binary: 1000

        // Left Shift
        System.out.println("Left Shift (<<):");
        System.out.println("num << 1 = " + (num << 1)); // Shifts bits left by 1 (10000, decimal 16)
        System.out.println("num << 2 = " + (num << 2)); // Shifts bits left by 2 (100000, decimal 32)

        // Right Shift
        System.out.println("\nRight Shift (>>):");
        System.out.println("num >> 1 = " + (num >> 1)); // Shifts bits right by 1 (100, decimal 4)
        System.out.println("num >> 2 = " + (num >> 2)); // Shifts bits right by 2 (10, decimal 2)

        System.out.println("Shift Operator ENDS here:---------------------------");

    }
}
