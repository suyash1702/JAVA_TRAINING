public class ClassDefinition 
{
    // Class and instance variables
    static int var1;
    int var2;

    // Static initialization block
    static {
        var1 = 50;  // Initialize before using
        System.out.println("Static var1: " + var1);
    }

    // Instance initialization block
    {
        var1 = 100;
        var2 = 200;
        System.out.println("Instance var1: " + var1);
    }

    // Constructor
    public ClassDefinition() {
        // Add initialization if needed
    }

    // Method to print variables
    public void printVar() {
        System.out.println("Current var1: " + var1);
        System.out.println("Current var2: " + var2);
    }

    // Main method to test the class
    public static void main(String[] args) {
        System.out.println("Creating first object:");
        ClassDefinition obj1 = new ClassDefinition();
        obj1.printVar();

        System.out.println("\nCreating second object:");
        ClassDefinition obj2 = new ClassDefinition();
        obj2.printVar();
    }
}
