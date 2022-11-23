import java.util.ArrayList;

public class ListsBasics {
    public static void main(String[] args) {

        //Lists AKA ArrayLists in java are pretty much the exact same as they are in python, except for 1 major thing.
        //Lists, like arrays, can only hold data of 1 type in java. Unlike arrays, however, lists don't have a max limit of elements.
        //To use lists, we must import it in from java.util 

        //syntax to create an ArrayList: ArrayList<listtype> <listname> = new ArrayList<listtype>();

        ArrayList<Integer> l = new ArrayList<Integer>();

        //We can use the following functions on lists:
        
        //we can add elements to them using <listname>.add(<element>);

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        
        //we can remove elements from them using <listname>.remove(<element>);
        
        //we can get and element at a certain index using <listname>.get(<indexofthe_elementwearesearchingfor>);
        
        //to change the element at a particular index we can use <listname>.set(<index>,<element>);
        //note that to use .set an element must already be present at that index; .set does not add an element to a list but simply 
        //changes what is already there
        
        //we can remove all elements from a list using <listname>.clear();

        //we can use <listname>.isEmpty(); to check if a list is empty

        //we can obtain elements in list between 2 indices using <listname>.subList(<startingindex>,<endindex>);
        //note that this will display a list containing all elements from the starting index to the ending index NOT INCLUDING THE
        //ENDING INDEX
        
        System.out.println(l);
        System.out.println(l.subList(0, 2));
        
        //there is another type of list called LinkedList which is faster than an ArrayList in certain operations.

        //As stated eariler in the SetsBasics.java file, there are also LinkedSets. Let's explain the linked version of data types
        //in a bit more detail here:

        //A LinkedList is a list in which the element is not stored alone, but is instead store with a pointer.
        //The pointer stored along with each element points to the next element in the list. 

        //That is the general way how all 'Linked' versions of collections work; a pointer is stored along with the element that will
        //direct the computer to the next element in the collection.
    }
    
}
