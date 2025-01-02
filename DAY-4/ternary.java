
public class ternary{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15, d = 25;
        
        // Using if-else to find maximum of four numbers
        int max;
        
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }
        
        System.out.println("Maximum number is: " + max);
    }
}

