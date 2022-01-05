
package gym.managment.system;

/*
==============================================================================
        a class that represents all the Coaches that work at the gym
==============================================================================
*/


public class Coach extends Employee {
//    this is attributes :p
    private boolean Private = false;  
    public String Type = "bodybuilding";
    
    //this is constractor to make new coach ;(
    public Coach(String name, int Age , int ID, int PhoneNum, int NationalID , int WorkingHrs , boolean Private, String streetAddress , String city ,String state ,int zip){
        Address home = new Address(streetAddress, city, state, zip);
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.WorkingHrs = WorkingHrs;
        this.Private=Private;
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        this.setAddress(home);
        this.setRate(50);
    }

//  Overridden viewProfile function to add the missing attributes ini the Coach class    
    @Override
    public void viewProfile(){
        super.viewProfile();
        System.out.println("Proffesion: "+ this.Type+"\n"+"is Private? "+ this.Private+"\n");
    }

//  Accessors and Mutators
    public boolean isPrivate() {
        return Private;
    }

    public void setPrivate(boolean Private) {
        this.Private = Private;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    
    
    
    
}
