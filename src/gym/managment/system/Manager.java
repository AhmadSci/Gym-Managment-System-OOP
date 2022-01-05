package gym.managment.system;

/*
==============================================================================
        a class that represents all the Managers that work at the gym
==============================================================================
*/

public class Manager extends Employee{
    
//  a Constructor for all the Managers at the gym
    public Manager(String name, int Age , int ID, int PhoneNum, int NationalID, int WorkingHrs, String streetAddress , String city ,String state ,int zip){
        Address home = new Address(streetAddress, city, state, zip);
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.WorkingHrs = WorkingHrs;
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        this.setAddress(home);
        this.setRate(100);
    }
    
//  for the mamager to "manage" the gym    
    public void manage() {
        System.out.println("GET BACK TO WORK YOU PEICES OF SHI*!");
    }
    
    
}
