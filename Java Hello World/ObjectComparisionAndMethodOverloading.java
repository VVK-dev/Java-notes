public class ObjectComparisionAndMethodOverloading {
    
    //Let's use the Phone class we created and try to compare 2 phones to see if they are equal:

    public static void main(String[] args) {
        
        Phone K9VIBE = new Phone("Lenovo", 2);
        Phone iPhone12 = new Phone("Apple", 4);

        //Lets compare these 2 phones to see if they are the same

        System.out.println(K9VIBE==iPhone12);

        //As expected, we get false. Now Let's try to compare 2 Phones that are the same but stored with different variables.

        Phone K10VIBE = new Phone("Lenovo", 2);

        System.out.println(K10VIBE==K9VIBE);

        //Here, we can see that although the have the same attributes, we get false. This is because java doesn't check the attributes
        //when we try to compare 2 objects, it compares their memory addresses. So even in the first comparision we got false
        //not because the iPhone12 and K9VIBE objects have different attributes, but because their memory addresses are different.

        //Let's create a .sameas() method to check if 2 phones are the same based on their attributes. Refer to Phone.java .

        System.out.println(K9VIBE.sameas(K10VIBE));

        //Now, using our method, we get true.


        //Now let's talk about method overloading.

        //Method overloading is simply a fancy name for a very simple process.
        //In java, multiple methods can have the same name as long as the type and/or number of their parameters is/are different. 
        //This is called method overloading.

    }
    
    //Here is an example of method overloading:

    static int plusMethod(int x, int y) {
        return x + y;
    }
      
    static double plusMethod(double x, double y) {
        return x + y;
    }
    //Here, although the 2 methods above have the same name, we cna still use them with getting any errors.
} 
