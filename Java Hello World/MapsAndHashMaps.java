import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsAndHashMaps {
    public static void main(String[] args) {

        //Maps have a few different implementations like lists, such as HashMaps, TreeMaps and LinkedMaps.
        //Maps are known in most other languages as dictionaries or HashTables.
        //Simply put, a map is a key-value pair where the key has to be an immutable data type, the exact data type of the keys we put in
        //is constrained by the type of map we are using.
        //Maps are a very fast datatype, all functions happen in constant time
        //To use any type of map we have to import it in from java.util

        //HASHMAPS

        //syntax to create a hashmap: Map <mapvariablename> = new HashMap();

        Map m1 = new HashMap();

        //to add any elements to a map we have to use the following syntax: <mapname>.put(<key>,<value>);

        m1.put("Hello", 0);

        System.out.println(m1);

        //as we can see from the output, maps aren't displayed like in python where there is a colon sign between the key and value,
        //instead maps are displayed such that there is an = sign between the keys and values'

        //we can use <mapname>.get(key); to get the value that key corresponds to.

        System.out.println(m1.get("Hello"));


        //Like dictionaries in python, HashMaps can contain keys of all datatypes and because of this Hashmaps can't sort their elements
        //and hence stores it's elements in a random order.

        //Other functions (AKA Methods in java) we can use with Maps:

        //1)We can use <mapname>.remove(<key>); to remove a key along with it's value
        
        //2)We can use <mapname>.containsValue(<value>) and <mapname>.containsKey(<key>) to check if a certain value or key exist in a 
        //map.

        //3)We can use <mapname>.clear() to remove all elements from a map.

        //4)We can use <mapname>.values() to get all the values in a particular map.

        //5)We can use <mapname>.keyset() to get all the keys in that map.

        //6)We can use <mapname>.isEmpty() to check if that map is empty.


        //TREEMAPS

        //TreeMaps are the exact same as HashMaps except that all keys in a TreeMap must be of the same immutable datatype, because of
        //this TreeMaps are able to sort their elements and do so in an ascending order.

        //The syntax to create a TreeMap is the exact same as a HashMap.

        Map m2 = new TreeMap();

        //All the functions we use to interact with a HashMap are the same with TreeMaps (like .put, .get, etc.)

        //LINKEDHASHMAPS

        //LinkedHashMaps are the exact same as HashMaps except that the elements in LinkedHashMaps are ordered in the way they are 
        //inputted. Unlike TreeMaps, the datatype of all keys need not be the same.

        //the syntax for all commands with LinkedHashMpas is the exact same as HashMaps.

        Map m3 = new LinkedHashMap();

        m3.put("Hello",0);
        m3.put(1, "Hi");

        System.out.println(m3);

    }
}
