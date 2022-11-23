import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Countthenumberoftimesanalphabetoccursinastring {
    public static void main(String[] args) {
        

        Scanner userinp = new Scanner(System.in);
        System.out.println("Enter a String:");
        String inp = userinp.nextLine();
        Map occurance = new LinkedHashMap();

        for (char i : inp.toCharArray()) {
            //<stringname>.toCharArray coverts a string into an array of individual characters INCLUDING WHITESPACES
            if(i!=' '){
                //Remember, single quotes ' ' are used to represent the char data type
                //the previous if statement is to check if i is a whitespace and if yes not to add it to the map
                if(occurance.containsKey(i)){
                    int val = (int) occurance.get(i);
                    occurance.put(i,(val+1));
                }else{
                    occurance.put(i, 1);
                }
            }
        }
        
        System.out.println(occurance);

        
    }
    
}
