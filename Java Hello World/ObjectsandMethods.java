public class ObjectsandMethods {
    public static void main(String[] args) {
        
        //An object is simply an instance of a certain datatype.

        //A method is anything that we call on an object (called a function in python).
        //eg of methods are .clear() on an arraylist or .length() on a string. These are built-in methods, equivalent to built-in
        //functions in python.

        //The 'main' method (the method all of this is in right now) is equivalent to the main namespace in python,
        //it will always run and it is where the main code of the program is executed.
        
        //We can create our own methods using the following syntax:

        //<public/private> <static> <typeofdatathe_methodwillreturn (if the method doesn't return anything we put 'void' here)> <methodname>(<parameter1datatype> <parameter1>, <parameterdatatyp2> <parameter2>){
        //  method code
        //}

        //syntax explanation:

        //PUBLIC/PRIVATE: In python, if in a function we want to create a variable that can be used outside that function we have to make
        //that variable gloabl. The public keyword does just that, but for the entire function instead. The private keyword does the
        //exact opposite, making the method have it's own namespace and everything inside the method local to that method.

        //STATIC EXPLAINED IN Staticexplanation.java



        hello1();
        String x = hello2();
        System.out.println(x);
        wordnumber("yo", 4);

    }

    //let's create a method:

    public static void hello1() {
        System.out.println("Hello!");                
    }

    public static String hello2() {
        return "Hi";
    }

    public static void wordnumber(String w , int n) {
        for(int i = 0; i < n ; i++){            
            System.out.println(w);    
        }
    }
}