package DAY2;

/** There are 3 types of Java variables
 * 1. Local Variables
 * 2. Instance Variables
 * 3. Class/Static variables
 * **/
/*
 * 1. Local variable : Declared inside a method or block and only accessible within that method or block.
 * 2. Instance Variable : Declared inside a class but outside a method. It is specific to each instance of class
 * 3. Class/Static Variables: Declared with the 'static' keyword. It belongs to the class and all instances of the class share the same variable
 */

public class VariableTypes {

    // this is method/block that has local variables in it and can be accessible from itslef only 
    public void showLocalVariable(){
        String localVar = "This is a local string variable";
        int localInterger = 10;
        System.out.println("This prints only local variables string as - " + localVar  + " and as Integer value " + localInterger + " !");
    }


    // instance variables has to be declared in the class but outside any methods, and is specific to each instance of class

    int instancaVarNum = 100;
    String instanceVarString = "This is instance variable";

    // static variable has to be declared with the keyword 'static' and it belongs to the class and all instances of the class

    static String staticVarString = "Hi I am a static string variable declared and I belongs to the class and all instances of the class";
    static int staticInt = 10;


    public static void main(String[] args) {
        //creating a new Obj from the original
        VariableTypes localVariableObj = new VariableTypes();    


        // Accessing Local variables 
        localVariableObj.showLocalVariable();
        // Accessing Instance variables 
        System.out.println("Instance Variable of : " + localVariableObj.instancaVarNum + " " + localVariableObj.instanceVarString) ;
        //Accessing Static variables
        System.out.println(VariableTypes.staticVarString);

        System.out.println(VariableTypes.staticInt);

        // //mutating the statica value but this is not a correct way to do although it works
        localVariableObj.staticInt=100;
        System.out.println(localVariableObj.staticInt);

         // mutating the statica value in a correct way as static
        VariableTypes.staticInt = 100;
        System.out.println(VariableTypes.staticInt);
        
    }
}
