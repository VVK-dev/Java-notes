public class Phone {
    
    protected String PhoneBrand;
    protected int PhoneRAM;
    protected static int PhoneCount = 0;
    
    public Phone(String Brand, int RAM){
        PhoneBrand=Brand;
        PhoneRAM=RAM;
        Phone.PhoneCount+=1; //Since this is a static variable we should access it in a static way.
        //The variable PhoneCount stores the total number of Phone objects created by adding 1 to itself everytime a Phone is created.
        //The static keyword means that the PhoneCount variable isn't instance specfic, it isn't like Brand or RAM, it won't be different
        //for every instance. It won't be 1 for the first phone when we add a second phone, it will be 2 and will stay as 2 until
        //we add another phone. Unlike, Brand and Ram, each phone and the phonecount variable aren't linked.
        
        //To access the PhoneCount variable, we have to use Phone.PhoneCount; . Unlike Brand or RAM, we don't need to specify which
        //phone we are talking about to get the count variable as it's static, and hence not linked to any 1 object. It is always
        //the same.
    }

    //Phone comparision method (refer to ObjectComparisionAndMethodOverloading.java)

    public boolean sameas(Phone otherphone) {
        if(PhoneBrand == otherphone.PhoneBrand && PhoneRAM==otherphone.PhoneRAM){
            return true;
        }else{
            return false;
        }      
    }
}   
