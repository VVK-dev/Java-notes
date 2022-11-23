import java.util.Scanner;
//to get inputs from the user we have to use a data type called scanner and to use scanners we need to import it in
//from java.util

public class Inputswithscanners {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //new just states that the variable sc is a new instance of the scanner data type
        //there are multiple types of scanners, System.in just means that this scanner takes input from the user thru the 
        //keyboard
        String scanned1 = sc.next();
        //scanned is a string that contains the next stream of input to the scanner sc
        //sc.next() returns a string
        int scanned2 = sc.nextInt();
        //sc.nextInt() returns any integer inputted by the user, if the user inputs a string we get an error 
        boolean scanned3 = sc.nextBoolean();
        //sc.nextBoolean returns a boolean value entered by the user IN STRING FORM so only true/false are accepted
        double scanned4 = sc.nextDouble();
        //similarly we can also use sc.nextDouble() to get a double
        //note that here the user can enter either a double or an integer and it will return a double
        
        //to convert an inputted value from one to another we cant use typecasting as in the previous program,
        //we have to use a special conversion method:
        int x = Integer.parseInt(scanned1);
        
        System.out.println(scanned1);
        System.out.println(scanned2);
        System.out.println(scanned3);
        //generally we just want to use the string version as whatever the user enters gets converted into a string 
        //including numbers, etc. like in python
    }
}