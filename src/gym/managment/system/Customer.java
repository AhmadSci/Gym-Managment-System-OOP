package gym.managment.system;

/*
==============================================================================
        a class that represents all the Customers at the gym
==============================================================================
*/

public class Customer extends GymPeople{
//  Attributes Declaration
    public int Invitations=3;
    public int Subscription=30;
    
    
//  to renew the subscription of a customer
    public void renewSub(Customer Customer, int Days){
        
        System.out.println(Customer.name+" Has been renewed for "+ Days+ " Days :)");
        this.Subscription += Days;
        
    }
    
//  to view the profile of the Customer    
     public void viewProfile(){
        System.out.println("Name: "+this.name+"\n"+"ID : "+this.ID+"\n"+"Age : "+this.Age+"\n"+"Subscription: "+this.Subscription+"\n"+"Invitations: "+this.Invitations+"\n"+"PhoneNum: "+this.getPhoneNum()+"\n"+"NationalID: "+this.getNationalID());
        
    }
     
//  Accessors and Mutators
    public int getInvitations() {
        return Invitations;
    }

    public void setInvitations(int Invitations) {
        this.Invitations = Invitations;
    }

    public int getSubscription() {
        return Subscription;
    }

    public void setSubscription(int Subscription) {
        this.Subscription = Subscription;
    }
     
     
}
