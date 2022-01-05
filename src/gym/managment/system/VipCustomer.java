package gym.managment.system;

/*
==============================================================================
        a class that represents all the VipCustomers at the gym
==============================================================================
*/

public class VipCustomer extends Customer{
//  Attributes Declaration
    private int FreeDrinks=2;
    private boolean VipLoungeEntry=true;
    
//  a Constructor for all the VipCustomers at the gym with minimal requirements
    public VipCustomer(String name, int Age , int ID,  int Days){
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.Subscription=Days;
        VipLoungeEntry=true;
        this.Invitations=5;
    }
 
//  a Constructor for all the VipCustomers at the gym with all the requirements
    public VipCustomer(String name, int Age , int ID,  int Days, int PhoneNum, int NationalID, int FreeDrinks){
        this(name, Age, ID, Days);
        this.FreeDrinks=FreeDrinks;
        this.setPhoneNum(PhoneNum);
        this.setNationalID(NationalID);
        VipLoungeEntry=true;
        this.Invitations=5;
        
        
    }
 
//  Overridden viewProfile function to add the missing attributes ini the VipCustomer class    
    @Override
    public void viewProfile(){
        super.viewProfile();
        System.out.println("FreeDrinks: " + this.FreeDrinks+"\n"+"VipLoungeEntry: "+VipLoungeEntry);
    }
    
//  Accessors and Mutators
    public int getFreeDrinks() {
        return FreeDrinks;
    }

    public void setFreeDrinks(int FreeDrinks) {
        this.FreeDrinks = FreeDrinks;
    }

    public boolean isVipLoungeEntry() {
        return VipLoungeEntry;
    }

    public void setVipLoungeEntry(boolean VipLoungeEntry) {
        this.VipLoungeEntry = VipLoungeEntry;
    }
    
    
    
}
