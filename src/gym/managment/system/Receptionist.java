package gym.managment.system;

/*
==============================================================================
      a class that represents all the Receptionists that work at the gym
==============================================================================
*/

public class Receptionist extends Employee{
   
//  a Constructor for all the Receptionist at the gym    
    public Receptionist(String name, int Age , int ID, int PhoneNum, int NationalID , int WorkingHrs, String streetAddress , String city ,String state ,int zip){
        Address home = new Address(streetAddress, city, state, zip);
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.WorkingHrs = WorkingHrs;
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        this.setAddress(home);
        this.setRate(25);
    }
    
}
