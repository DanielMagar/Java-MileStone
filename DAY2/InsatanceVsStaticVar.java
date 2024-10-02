package DAY2;
// both the instatnce variables and static variablea are accessible but has major differences in many ways
/**
 * 1. Instance variables (Non-static variables) : 
 *    - Belong to the instance (Object) : Each object of the class has its own separte copy of instance variables. 
 *      these variables are tied to individual instances, meaining each object has its own state for these variables
 *    - Created and destroyed with Objects: Instance variables are created when object is created (with the 'new' keyword) and 
 *      destroyed when the object is garbage collected
 *    - Access: We access instance variables through the object
 *    - scope: Instance variables can only be accessed with the context of specified object
 * 
 * 2. Static Variables :
 *    - Belong to the class : Static variables are shared across all instances of class. There is only one copy of static variable
 *      regardless of how many instances of class is created.
 *    - Created when the class is loaded: Static variables are created when the class is first loaded into memory, and they remain in
 *      the memory until the class is unloaded, typically when the application exits.
 *    - Access: Static variables can be accessed directly using the class name (without creating any object). They can also be access through 
 *      objects, but this is discouraged because it can leads to confusion.
 *    - Scope: Static variables are accessible within the entire class, and they are shared among all instances of the class.
 * 
 */
public class InsatanceVsStaticVar {
    static int staticVar = 0; // Static variable
    int instanceVar = 0;      // Instance variable

    public static void main(String[] args) {
        InsatanceVsStaticVar obj1 = new InsatanceVsStaticVar();
        InsatanceVsStaticVar obj2 = new InsatanceVsStaticVar();

        // Increment static and instance variables in obj1
        // InsatanceVsStaticVar.staticVar++;
        obj1.staticVar++;
        obj1.instanceVar++;

        // Check values in obj2
        System.out.println("Static Var in obj2: " + obj1.staticVar);     // Output: 1 (shared value)
        System.out.println("Instance Var in obj2: " + obj2.instanceVar); // Output: 0 (separate value)
    }
}

/*
 * In this case:

    Static variable (staticVar): Changes made by obj1 are reflected in obj2 because the static variable is shared.
    Instance variable (instanceVar): Changes made by obj1 are not reflected in obj2 because each instance has its own copy of instanceVar.
 */
