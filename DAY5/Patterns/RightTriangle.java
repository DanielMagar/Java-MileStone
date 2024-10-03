 package DAY5.Patterns;

 public class RightTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String star = ""; // Local variable
            for (int j = 0; j < i; j++) {
                star += "*"; // Append asterisk
            }
            System.out.println(star); // Print the row
        }
    }
}