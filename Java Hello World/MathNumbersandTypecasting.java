public class MathNumbersandTypecasting {
    public static void main(String[] args) throws Exception {
    //addition, subtraction and multiplication are the same as in other languages, but division and exponents are treated 
    //slightly differently in java:
    int x = 3;
    int y = 2;
    int val1 = x/y; 
    System.out.println(val1); //this prints 1 as both the operands (3,2) and the result variable (val1) are stored as integers
    double val2 = x/y;
    System.out.println(val2); //this prints 1.0 rather than 1.5, this is because although the result variable (val2) is stored
    //as a double, the operand variables (z,y) are stored as integers
    //So if we want to print the actual value of 3/2, we need to store atleast one of the operand variables as a double:
    double a = 2;
    double b = 3;
    double val3 = b/a;
    System.out.println(val3); //this prints 1.5
    //if we change the data type of val3 to int, then it will print 1 rather than 1.5 
    
    //now onto exponents
    //unlike most other languages, ** is not an operator, if we want to use exponents we have to import it from the default Math
    //library using Math.pow, EXPONENTS ARE ALWAYS SAVED AS DOUBLES
    double val4 = Math.pow(y,x);
    System.out.println(val4);
    
    //modulus also exists, functions exactly the same as in python
    
    //typecasting
    //to change one variable's data type to another, we can use the following method: (intended variable type)<variable>
    int val5 = (int)val4;
    System.out.println(val5);
    //or if we just want to print it as a separate data type and not store it as a different variable with a different data type
    System.out.println((int)val4);

}    
}
