import java.util.Arrays;

public class Arraysbasics {
 public static void main(String[] args) {
     
    //Arrays are the more basic versions of lists, they are pretty much the same as lists except that arrays can only hold data of 1 type
    //and arrays can only hold upto a fixed number of elements. Arrays also use up less memory than lists and are generally preferred for
    //holding large amounts of data.
    //For more info regarding arrays,sets and lists see BasicsofSetsAndLists.java

    //Arrays are data containers and can't actually be printed on their own like lists, they are simply containers not actual objects
    //on their own. So if we want to display an array we have to use a loop to print out each of it's elements individually
    
    //there are 2 syntaxes for creating an array:

    //1) <arraydatatype>[] <arrayname> = new <arraydatatype>[<numberofelements>]
    
    String[] array1 = new String[4];
    //here we have created a new array called array1, it has a max of 4 element slots that are currently empty and contain the 'null' 
    //value
    array1[0] = "Hello";
    //here we have set the first element in the array as hello
    //
    System.out.println(array1[0]);

    //2) <arraydatatype>[] <arrayname> = {<arrayelements>};
    
    //in this syntax, rather than creating a variable to hold the array then adding in the array elements separately later on,
    //we just staight up create the array itself

    int[] nums = {4,3,2,1};
    
    //We can use <string>.toCharArray() to convert a string into an array individual characters. THIS METHOD INCLUDES WHITESPACES.

    //SORTING AN ARRAY

    //We can use Arrays.sort(<arrayname>,<startingindex>,<endingindex>) to sort an array from one particular index to another.
    //Note that the 2nd and 3rd arguments in the arrays.sort method are optional, if we just want to sort the entire array
    //we can just give the first argument, i.e. <arrayname> alone.
    
    //TO USE THIS METHOD WE HAVE TO IMPORT java.util.Arrays

    Arrays.sort(nums);
    
   for(int i: nums){
      System.out.print(i+",");
   }


 }   
}
