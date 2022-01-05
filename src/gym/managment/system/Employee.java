package gym.managment.system;

/*
==============================================================================
        a class that represents all the Employees at the gym
==============================================================================
*/

public class Employee extends GymPeople {
//this is attributes :)
    public int WorkingHrs = 8;
    private int Salary;
    private int WorkingDays = 30;
    private int Rate = 25;
    private int DiscountF = 25;
    private int Discount = 20;
    private Address Address;

    // this is functions ;(
    protected int SalaryChk() {
        Salary = WorkingHrs*Rate*WorkingDays;
        return Salary;
    }
    
    public void viewProfile(){
        System.out.println("Name: "+this.name+"\n"+"ID : "+this.ID+"\n"+"WorkingHrs: "+this.WorkingHrs+"\n"+"PhoneNum: "+this.getPhoneNum()+"\n"+"NationalID: "+this.getNationalID()+"\n"+"Salary: "+this.SalaryChk() +"\n"+"Discount For Friends: "+this.DiscountF+"\n"+ "Discount: "+this.Discount);  
        Address.viewAddress();
    }
// this is getter and setter :P

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(int WorkingDays) {
        this.WorkingDays = WorkingDays;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    public int getDiscountF() {
        return DiscountF;
    }

    public void setDiscountF(int DiscountF) {
        this.DiscountF = DiscountF;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    public void getAddress() {
        Address.viewAddress();
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }
    
    
    
    
}
