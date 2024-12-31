// PART A

public class mainCopyContructors 
{
    public static void main(String[] args) 
    {
        copyConstructors object1 = new copyConstructors();
        object1.printVariables();  
        
        copyConstructors object2 = new copyConstructors(10,15);
        copyConstructors object3 = new copyConstructors(object2);
        object3.printVariables();
    }    
}
