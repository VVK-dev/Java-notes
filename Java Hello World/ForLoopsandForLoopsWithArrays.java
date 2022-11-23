import java.util.Scanner;

public class ForLoopsandForLoopsWithArrays {
    public static void main(String[] args) {

        //For loops in java function the same as in any other language
        //syntax for for loops: for(<variablebeingusedbyloop>;<conditon>;<functiontobeexecuted_ifconditionismet>){
        //<code executed per loop> 
        //}
        //the break and continue functions are also the same in java
        
        for(int i =0; i<=10 ; i++){
            System.out.println(i);
        }    
        //here we have declared a variable i and are making the loop run as long as i is less than or equal to 10 and incrementing i 
        //once per loop
        
        int j = 0;
        for( ; j<1; j++){
            System.out.println("Here as we have already declared the variable j beforehand there is no need to redeclare it in the loop");
        }
    
        //USING FOR LOOPS WITH ARRAYS
        
        //like in python, there are many ways we can use for loops to display the elements of an array, but here i'll discuss the main 2:

        int[] nums = {1,3,4,2};

        //1) using the length of the array to print out each element in the array by iterating through their indices

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        
        //using this way, we can print out each element in an array, BUT we aren't actually iterating through the array this way
        //we are simply going through the indices of the array using it's length and then printing out what the element at that index
        
        //2)using a for loop to actually iterate through the elements of an array 
        //syntax:
        //for(<arraydatatype> <variablenamethatwillholdthecurrentelement>:<arrayname>){
        //}
        //this is called a 'for each loop' 
    
        for (int element:nums){
            System.out.println(element);
        }
        
        //let's try printing the indices along with the element itself

        int count=0;
        for (int element:nums){
            System.out.println("Value "+element+" found at index "+count);
            count++;
        }

        //inputting data into an array using a for loop
        
        int[] nums2 = new int[5];
        
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i <= nums.length; i++){
            System.out.println("Enter a value to be put into the array: ");
            int inpfromuser = inp.nextInt();
            nums2[i] = inpfromuser;
        }
        int index = 0;
        for (int i:nums2){
            System.out.println("The array has: "+i+" at position "+ index);
            index++;
        }

        //we can also break out of a loop using the break; command, exactly how it is in python just with a semicolon

    }
    
}
