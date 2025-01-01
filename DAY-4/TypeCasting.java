public class TypeCasting {
    public static void main(String[] args) {
        new TypeCasting().performTypeCasting(0.0f, 0.0f);
    }

    void performTypeCasting(float a, float b) {
        int x = 10;

        //Implicit
        a = x;  
        System.out.println("Float a: " + a);

        //Explicit
        double d1 = 15.1D;
        x = (int)d1;   
        System.out.println("Int x: " + x);
    }
}