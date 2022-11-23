public class ClassesandInheritance {
    public static void main(String[] args) {
        
        //A class is basically a datatype, you can create a class and therfore your own datatype with it's own methods. It's the same
        //as it is in python.
        //Thats why datatypes are aka classes.
        //Unlike python however, everytime we want to create a new class we have to create a new .java file. In python we can just
        //have all our classes in the same file.
        //And unlike python, every java file MUST have a class.
        
        //The syntax for creating a class can be seen at the top of every file's code:
        //<public/private> class <classname>{
        //  methods
        //}

        //Public/private decide whether other classes can use the date in this class or not with public being yes and private being no.

        //Lets create an example class called Dog.java which will create the dog class containing methods called name and age which
        //will store the dog's name and age respectively.
        //refer to Dog.java

        //Let's create a few Dogs (we don't have to import the Dog.java file as this file and dog.java are part of the same package)

        Dog dog1 = new Dog("A", 1);
        Dog dog2 = new Dog("B", 4);
        dog1.speak();

        String dog1name = dog1.petname;
        
        //Because we used a public variable to store the dog's name it can be accessed from any file.

        dog2.setage(3);
        dog2.speak();


        //INHERITANCE

        //Let's create a cat class that will inherit all of the dog class's attributes.
        //Refer to Cat.java

        Cat cat1 = new Cat("Query", 3, 12);

        cat1.eat();

    }
}
