
public class MaxOfFour {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15, d = 25;
        int max = (a > b ? a : b) > (c > d ? c : d) ? 
                  (a > b ? a : b) : (c > d ? c : d);
        
        System.out.println("Maximum number is: " + max);
    }
}
