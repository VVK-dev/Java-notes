import java.util.Set;
import java.util.HashSet;
//to use sets we have to import it in from java.util like scanners

public class SetsBasics {
    public static void main(String[] args) {

    //Sets and lists are a fairly complicated part of java, so here and in the following 
    //files we will only be discussing a very standard and relatively basic way to implement them.
    //Sets, Lists and Arrays are all types of collections (will not go into further detail here).
    
    //SETS

    //A set is an unordered collection of UNIQUE elements of a single type, no elements in a set can be the same.
    //A set can have at most 1 null entry.
    //Unlike arrays, sets do not have a set length.
    //Sets are also extremely fast, whether adding, removing or searching for an element in a set, it is much much faster than
    //doing the same with an array. In fact, regardless of how large the set is, doing any function with a set always takes the
    //same amount of time, which is nearly instant.
    //The simplest way to think of sets is to visualise them as a bubble, we can put things into the bubble but
    //we dont know where those things are in the bubble; the elements of a set dont have indices or any order.

    //There are several different types of sets. We shall be only going over HashSets as they are the simplest and most general form
    //of sets.
    //To use HashSets, we have to import it in from java.util
    
    //syntax: Set<settype> <setvariablename> = new HashSet<settype>();
    //Inside the () at the end we can enter another set, so that the new set we are creating gains all the elemets from that set

    Set<Integer> s1 = new HashSet<Integer>();
    Set<Integer> s2 = new HashSet<Integer>(s1);

    //to add elements to a set we can use <setvariablename>.add(<elementwewant_toadd>)

    s2.add(1);
    s2.add(2);
    s2.add(3);
    s2.add(4);

    // lets see what happens if we try to add 1 again
    s2.add(1);

    System.out.println(s2);

    //as you can see from the printed out result, adding 1 to the set again doesn't raise an error, instead java simply ignores that
    //add statement as 1 already exists in the set

    //we can check if a particular element exists in a set using <setvariablename>.contains(<elementwearesearchingfor>);

    boolean x = s2.contains(4);
    System.out.println(x);

    //Other functions with sets:

    //to remove an element we can use <setvariablename>.remove(<elementname>);
    //to remove all elements from a set we can use <set>.clear();
    //to check if a set is empty we can use <set>.isEmpty();
    //to get a set's length we can use <set>.size();
    
    //There are 2 other forms of Sets called TreeSets and LinkedHashSets. TreeSets are the same as HashSets but have a structure to them.
    //TreeSets don't have indices for the elements but order them in a Tree data structure (will not be explained further here). Elements
    //in TreeSets are stored in a sorted and ascending order.
    //LinkedHashSets are the same as HasSets but faster with some operations (the linked version of sets and lists are explained in the
    //ListsBasics.java file)


    }
}
