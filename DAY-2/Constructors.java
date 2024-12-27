class Constructors {
    int intVar;
    String stringVar;
    boolean booleanVar;
    char charVar;

    Constructors(){ 
        intVar= 10;
        stringVar = "Suyash";
        booleanVar = true;
        charVar = 'a';
    }
    // Parameterised Constructors
    public Constructors(
        int iVariable,
        String sVariable,
        boolean bVariable,
        char cVariable
    ){
        
    }
    
    
        public void printVar(){
            System.out.println("Integer : " + intVar);
            System.out.println("String : " + stringVar);
            System.out.println("Boolean : " + booleanVar);
            System.out.println("Character : " + charVar);
        }
    
}
