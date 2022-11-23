public class Cat extends Dog{
    
    //We can use the extend keyword to say that the Cat class will inherit all of the Dog class's atrributes thereby becoming a subclass
    //or derived class of the Dog parent or superclass
    //After using the extends keyword we must create a constructor method that has the same parameters it's superclass's,
    //i.e. Dog.
    
    private int food; 

    public Cat(String name, int age, int catfood) {
        super(name, age);
        //Here we use the super keyword to explicitly call the constructor parameters of the superclass, i.e. Dog, and basically
        //say that the name and age of cat class are the same it's superclass.
        //That doesnt stop us from adding any more paramters, we can give it a new parameter called food

        food = catfood;

    }

    //Let's create a 2nd constructor method. Having mutiple constructor methods will allow the user to choose between them to create
    //an object of the same class.

    public Cat(String name, int age){
        super(name, age);
    }

    //Using this 2nd constructor method, we can now create a cat object with or without the food parameter, the food parameter is
    //now optional.

    //Let's create a 3rd constructor method this with only 1 parameter.

    public Cat(String name){
        super(name, 0);
        //Here we are setting the default value of the age parameter to 0 if it is not given, thereby allowing creation
        //of a cat object when only it's name is given.
    }

    public void eat(){
        System.out.println(petname + " ate " + food + " bits of catfood");
    }

}
