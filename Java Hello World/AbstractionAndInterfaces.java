public interface AbstractionAndInterfaces {

    //ABSTRACTION

    //Data abstraction is the process of hiding certain details and showing only essential information to the user.
    //Abstraction can be achieved with either abstract classes or interfaces.

    //The abstract keyword is a non-access modifier, used for classes and methods:

    //Abstract class: is a class that cannot be used to create objects (to access it and use the methods within it, 
    //it must be inherited by another class). Abstract classes can have both abstract and regular methods.

    //Abstract method: can only be used in an abstract class, and it does not have a body.
    //The body is provided by the subclass (inherited from).

    public abstract void abcd();

    //Here we have created a void method that does not have a body using the abstract keyword. We cannot use this method to create any
    //objects, we have to inherit it and re define in the subclass to do so.

    //INTERFACES

    //Another way to achieve abstraction in Java is with interfaces.
    //An interface is a completely abstract class that is used to group related methods with empty bodies.

    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)

    //To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class 
    //using the 'implements' keyword (instead of extends). The body of the interface method is provided by the 'implement' class.

    /*
    interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
    }

    class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
    } 
    */

    /*
    Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal"
    object in the MyMainClass).
    1) Interface methods do not have a body - the body is provided by the "implement" class.
    2) On implementation of an interface, you must override all of its methods.
    3) Interface methods are by default abstract and public.
    4) Interface attributes are by default public, static and final.
    5) An interface cannot contain a constructor (as it cannot be used to create objects).
    */

    //Why And When To Use Interfaces?
    //1) To achieve security - hide certain details and only show the important details of an object (interface).

    //2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
    //However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
    //Note: To implement multiple interfaces, separate them with a comma.

}
