import java.util.Scanner;

public class InputyourAge {
    public static void main(String[] args) {
        
        System.out.println("Enter your age:");
        Scanner inp1 = new Scanner(System.in);
        int inpval = inp1.nextInt();
        if(inpval>=18){
            System.out.println("You are an adult.");
            System.out.println("Name some good food:");
            Scanner inp2 = new Scanner(System.in);
            String inp2val = inp2.nextLine();
            if(inp2val.equals("MyCook paneer starters are epic")){
                System.out.println("Now ya talking");
            }
        }
        else if(inpval>=13) {
            System.out.println("You are pretty much still a child. Go study.");
        }
        else{
            System.out.println("You are a child. Go study.");
        }
    }
}