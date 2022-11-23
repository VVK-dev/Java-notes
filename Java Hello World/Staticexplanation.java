public class Staticexplanation {

    //There are 2 types of static things: variables and methods
    
    //A static variable is a variable in a class that isn't specific to each instance of that class as an object. It's a variable that
    //is inisde the class and related to the class but doesn't change with every instance of the class, it remains static.
    //Refer to Phone.java for an example

    //Static methods are what we have been using all this time to create a method. A static method is one that doesn't require an
    //instance of a class (i.e. an object) to execute. An example of this can be seen in Dog.java. In the Dog class, 
    //we have a method speak(). The speak() method requires an instance of the Dog class - a dog object - to be run.

    public static void main(String[] args) {
     
        Dog Yoyo = new Dog("Yoyo", 2);
        Yoyo.speak();
        //To use the speak() method, we have to specify which dog is speaking by using the dog's variable name. We can't call or execute
        //the speak method without specifying which dog is speaking, so in order to use the speak() method we have to create a dog.
        
        //A static method is like the one this comment is in, we don't need to create an instance of a class (i.e. an object) to execute
        //this method. Similarly with all the other methods in all the other files, we don't need to create an object of that class
        //to use a static method.
    }

}
