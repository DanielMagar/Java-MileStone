package DAY2;

/*
 * In the example below, we demonstrated that we can get an error when the compiler tries to convert a large data type to a small data type. 
 * Here, we created the num1 integer and num2 double variable. 
 * The sum of num1 and num2 will be double, and when we try to store it to the sum of the int type, the compiler gives an error.
 */

public class TypeCastingWithError {
    public static void main(String[] args) {
        // Define int variables
        int num1 = 5004;
        double num2 = 2.5;
        int sum = num1 + num2;
        // show output
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
     }
}
