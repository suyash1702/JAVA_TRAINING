public class ExtraFloat {
    public static void main(String[] args) {
        // Float examples with different decimal places
        float f1 = 3.14159f;
        float f2 = 3.14f;
        float f3 = 3.141592653589793f; // Will be truncated to ~7 decimal places

        // Double examples with different decimal places  
        double d1 = 3.14159;
        double d2 = 3.14;
        double d3 = 3.1415926535897931; // Can store ~15 decimal places

        // Print float values
        System.out.println("Float values:");
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2); 
        System.out.println("f3: " + f3);

        // Print double values
        System.out.println("\nDouble values:");
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
    }



}