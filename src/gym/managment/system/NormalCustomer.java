package gym.managment.system;

/*
==============================================================================
        a class that represents all the NormalCustomers at the gym
==============================================================================
*/

public class NormalCustomer extends Customer{
    
//  a Constructor for all the NormalCustomers at the gym with minimal requirements
    public NormalCustomer(String name, int Age , int ID,  int Days){
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.Subscription=Days;
    }
    
 //  a Constructor for all the NormalCustomers at the gym with all the requirements
    public NormalCustomer(String name, int Age , int ID,  int Days, int PhoneNum, int NationalID ){
        this(name,Age,ID,Days);
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        
        
    }
    
    
    
}
