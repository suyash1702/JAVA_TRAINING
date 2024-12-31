//PART B
class copyConstructors 
{   
    // INSTANCE VARIABLE
    int number1 ;  // TYPE NAME
    int number2 ;

    // DEFAULT CONTRUCTOR
    public copyConstructors()
    {
        number1 = 50;
        number2 = 20;
    }

    // PARAMETERIZED CONSTRUCTOR
    public copyConstructors(int number3,int number4)
    {
        number1 = number3;
        number2 = number4;
    }

    public copyConstructors(int number5)
    {
        number1 = number5;
    }

    // COPY CONSTRUCTOR
    public copyConstructors(copyConstructors obj3)
    {
        this.number1 = obj3.number1;
        this.number2 = obj3.number2;
    }

    public void printVariables()
    {
        System.out.println("number1 :" + number1);
        System.out.println("number2 :" + number2);
    }

}
