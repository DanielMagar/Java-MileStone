package DAY5.Patterns;

public class RightTrianglePatternWithMethods {
    public void displayPattern(int patternCount){
        String stars="";
        for(byte i = 1; i<=patternCount; i++){
            stars = "*";
            for(byte j = 1; j<i; j++ ){
                stars+="*";
            }
            System.out.println(stars);
        }
    }

    public static void main(String[] args) {
        RightTrianglePatternWithMethods obj = new RightTrianglePatternWithMethods();
        obj.displayPattern(5);
    }
}
