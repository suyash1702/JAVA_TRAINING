public class Numbers {
    // Instance variables (class level)
    private int number1;    // This is the instance variable
    private int number2;    // This is the instance variable
    
    // Parameterized constructor
    public Numbers(int number1, int number2) {  // Constructor parameters SHADOW the instance variables
        // Without 'this', number1 refers to the parameter, not the instance variable
        // This is where shadowing occurs!
        
        // WRONG WAY (Shadowing problem):
        number1 = number1;  // This doesn't work! Parameter shadows instance variable
        number2 = number2;  // This doesn't work! Parameter shadows instance variable
        
        // CORRECT WAY (Using 'this' to resolve shadowing):
        this.number1 = number1;  // 'this.number1' refers to instance variable
        this.number2 = number2;  // 'this.number2' refers to instance variable
    }
} 