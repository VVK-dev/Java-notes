public enum Enums {

    //Enum is short for "enumerations", which means "specifically listed".

    //An enum is basically a collection of constants, i.e. variables whose value won't change.
    //We can create multiple constants and separate them with a comma. Note that they should be in uppercase letters.

    LOW,
    MEDIUM, 
    HIGH;

    //We access an enum constant using <enumname>.<constant>;

    //We can also have enums within a class:

    /*public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
        }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM; 
        System.out.println(myVar);
        }
    }
    */

    //We can use the <enumname>.values() method to return an array of all enum constants.

    //Enum constants are public, static and final (unchangeable - cannot be overridden).

    //An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

}
