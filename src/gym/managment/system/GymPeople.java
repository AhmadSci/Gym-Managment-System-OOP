package gym.managment.system;


/*
==============================================================================
            a class that represents all the people in the gym
                from customers all the way to employees
==============================================================================
*/

public class GymPeople{
//  Attributes Declaration
    public String name;
    public int ID;
    public int Age;
    private int NationalID;
    private int PhoneNum;

//  a report function for the person to report a problem at the gym
    public void Report(String msg) {
        System.out.println(msg);
    }

//  accessors and mutators 
    public int getNationalID() {
        return NationalID;
    }

    public void setNationalID(int nationalID) {
        NationalID = nationalID;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
}
