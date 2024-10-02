package DAY2;

/*
 * Narrowing type casting is also known as explicit type casting or explicit type conversion which is done by the programmer manually. 
 * In the narrowing type casting a larger type can be converted into a smaller type.
 */
public class NarrowTypeCasting {
    public static void main(String[] args) {
        int num = 5004;

        // narrow type casting int to double

        double doubleNum = (double) num;
        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);

        // narrow type casting double to int

        int narrowDoubleToInt = (int) doubleNum;

        System.out.println("The value of " + doubleNum + " after converting to the double is " + narrowDoubleToInt);
    }
}
