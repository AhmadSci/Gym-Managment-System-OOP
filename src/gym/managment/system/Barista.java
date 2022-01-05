package gym.managment.system;

/*
==============================================================================
        a class that represents all the Baristas that work at the gym
==============================================================================
*/
public class Barista extends Employee{

//  a Constructor for all the Baristas at the gym
    public Barista(String name, int Age , int ID, int PhoneNum, int NationalID, int WorkingHrs, String streetAddress , String city ,String state ,int zip){
        Address home = new Address(streetAddress, city, state, zip);
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.WorkingHrs = WorkingHrs;
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        this.setAddress(home);
        this.setRate(20);
    }

//  to tell the barista to make a drink    
    public void makeDrink(String type){
        
        System.out.println("Heres Your "+type);
        
    }
   
    
}
