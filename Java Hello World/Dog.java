public class Dog {

    public String petname;
    protected int petage;

    //Here, we created public variables to contain the name and age of the dog. This is so that we can easily get the dog's name and 
    //age in any file by using <dogvariablename>.dogname; 
    //Generally though, we should use private variables to store them so that other classes can't interfere with these variables.
    //We can also set these variables to protected, which means that only sub-classes of Dog and other clasees in the same package
    //as Dog can view, access and use these variables.

    //Now we have to create a constructor method. Generally we only need 1 of these but we can have multiple of them if needed.
    //A constructor method is basically what we use to create the actual object.

    public Dog(String name, int age){
        //this is a constructor method to create an object type called Dog
        //we have created the dog object and are passing the name and age parameters to it, so now when we want to create a variable of the
        //dog datatype we have to give a name and age to it
        //Lets set the name and age to the variables we created earlier to store them easily
        
        this.petname = name;
        this.petage = age;

        //the this keyword refers to the current class, so what we're saying here is that when a Dog object is
        //created, the name attribute of that particular dog ,i.e. the first variable entered when creating a Dog, is stored in the petname
        //variable. We don't really need to use the this keyword when we create a constructor method like this, the this keyword
        //is just here so that if there already exists a petname variable in another class, java will store the pet's name
        //in this class's petname variabel and not the other's.
    }

    public void speak() {
        System.out.println("Hello! My name is " + petname + " and I am " + petage + " year(s) old.");
    }
    public void setage(int newage) {
        petage = newage;
    }
}
