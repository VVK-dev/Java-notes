
public class Switches {
    
    //We can use switch statements to check for several conditions and execute code for each one.
    //1 switch statement works like multiple if statements.

    /* syntax:
    
    switch(expression) {
        case x:
            // code block
        case y:
            // code block
    } */

    //We can use the break keyword at the end of each case so that if a particular case is true only that code is executed and 
    //the others are skipped.

    //We can also use the default keyword to execute a block of code if no cases are valid.

    /* syntax with break and default:

    switch(expression) {
        case x:
            // code block
            break;
        case y:
            // code block
            break;
        default:
            // code block
    } */

    //example:

    public static void main(String[] args) {
        int day = 5;

        switch(day){
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}
