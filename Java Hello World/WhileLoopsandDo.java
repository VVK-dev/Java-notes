import java.util.Scanner;

public class WhileLoopsandDo {
    public static void main(String[] args) {

        //while loops function exactky the same as in python
        //syntax:
        //while(condition){
        //}
        //as long as the given condition is true the loop will run
        
        int i = 0;
        
        while (i != 10){
            System.out.println(i);
            i++;
            if (i==9){
                System.out.println("i is equal to 9");
                break;
            }
        }

        //the 'do' keyword executes a section of code, it's effectively the same thing as simply writing the code out
        //using do and while we can create something called a 'do-while loop'

        //the difference between using a do-while loop and a while loop is that during the first iteration, a do-while loop will
        //execute the code and then check the while condition when it encounters it, effectively executing the code once 
        //before even intialising the loop 
        
        Scanner inp = new Scanner(System.in);
        int j;
        
        //here we declare a variable j to hold the inputted value before we initialise the loop
        //this is because the condition part of the while statement looks outside the entire loop itself (including the do part)
        //for the condition variable, like in a normal while loop 

        do{
            System.out.print("Enter a number:");
            j = inp.nextInt();
        } while (j != 10);
        

    }
    
}
