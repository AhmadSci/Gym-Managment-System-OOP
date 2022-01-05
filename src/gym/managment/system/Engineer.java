package gym.managment.system;

/*
==============================================================================
        a class that represents all the Engineers that work at the gym
==============================================================================
*/


public class Engineer extends Employee{
//  Attributes Declaration
    private int Experience;
    private int amountOfFixes;
    
    
//  a Constructor for all the Engineers at the gym
    public Engineer(String name, int Age , int ID, int PhoneNum, int NationalID, int amountOfFixes, int Experience, String streetAddress , String city ,String state ,int zip){
        Address home = new Address(streetAddress, city, state, zip);
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.amountOfFixes = amountOfFixes;
        this.Experience = Experience;
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        this.setAddress(home);
        this.setRate(100);
    }
    
//  Overridden SalaryChk function from the super class(Employee) for different calculation
    @Override
    public int SalaryChk() {
        this.setSalary(this.getRate()*amountOfFixes*Experience);
        return this.getSalary();
    }
    
    
//  checkup function for the Engineer to check-up on all the machines and report if there are any broken machines    
    public String checkup(int amountOfBrokenMachines){
        
        if(amountOfBrokenMachines == 0){
            return "good";
        }
        else{
            this.amountOfFixes+= amountOfBrokenMachines;
            if (amountOfBrokenMachines == 1){
                return "there is one broken machine";
            }else{
                return "there are "+amountOfBrokenMachines +" broken machines";
            }
        }
    }
        
//  repair function for the Engineer to repair a given machine
    public void repair(GymMachine Machine){
        System.out.println(Machine.MachineName +" machine repair will take 2hr!");
        System.out.println("this machine is now good :)");
        
        
    }
    
//  Overridden viewProfile function to add the missing attributes ini the Engineer class
    @Override
    public void viewProfile(){
        super.viewProfile();
        System.out.println("Experience: "+this.Experience+"\n"+"Fixes this month: "+this.amountOfFixes+"\n");
    
    }
    
//  Accessors and Mutators
    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public int getAmountOfFixes() {
        return amountOfFixes;
    }

    public void setAmountOfFixes(int amountOfFixes) {
        this.amountOfFixes = amountOfFixes;
    }

    public int getWorkingHrs() {
        return WorkingHrs;
    }

    public void setWorkingHrs(int WorkingHrs) {
        this.WorkingHrs = WorkingHrs;
    }
    
    
    
    
}
