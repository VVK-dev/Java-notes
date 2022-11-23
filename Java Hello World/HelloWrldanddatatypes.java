public class HelloWrldanddatatypes {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //primitive data types
        int a = 8;
        boolean b = true;
        double c = 8.0; //double is just a bigger version of float, double can hold twice the amount of characters than float
        char d = 'v'; //char is a string that can hold only 1 character, it is represented using single quotes: ''
        
        //string is not a primitive data type, a primitive type is predefined by the language and is named by a 
        //reserved keyword
        
        String e = "yo";

        System.out.print(a);
        //println prints the value then moves the cursor to the next line for the next print statement, like \n in python
        //print prints the value and then leaves the cursor where it is after printing 
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int x;
        //here we have declared that an integer variable x exists but we have not given it a value, this is a legal way to declare
        // a variable BUT it will result in an error if we try to print it

        //after we declare a variable along with it's data type, we don't have to redeclare the variable's data type again if we want
        //to change it's value

        x=10;

        /* We can create multi line comments using 
        the symbols used here */
        
    }
}
