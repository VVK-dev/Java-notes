import java.util.Scanner;

public class ConditionsIfElseandBooleans {
    public static void main(String[] args) {

        //we can use !(something) to get the not version of it
        boolean compare = !(false);
        System.out.println(compare);
        //booleans in java are treated pretty much the exact same way in oython so not much to write about

        //if we want to check if 2 strings are equal then we can use <string1>.equals(<string2>), we can use == but it sometimes
        //may not work the way we expect it to
        System.out.println("hello".equals("hello"));
        
        //the conditional statements in java are if, else, ifelse, ifnull, ifnotnull and else if
        //note that else if isnt a keyword on its own like elif like in python, we have to use else and if separately
        //the syntax for conditional statements is: if/else/etc.(condtion){
        // <execute this code>
        //}
        Scanner inp = new Scanner(System.in);
        String inpval = inp.nextLine();    
        if(inpval.equals("hello")){
            System.out.println("You typed hello");
        }  
        else if(inpval.equals("Hi")){
            System.out.println("You typed Hi");
        }
        //if whatever the user enters is not covered in the if/else if part, nothing is given as an output, we dont get an error
        //in that case

    }
}
