package gym.managment.system;

/*
==============================================================================
            a class to store the addresses of the Employees
==============================================================================
*/

public class Address {
//  Attributes Declaration    
    private String streetAddress, city, state;
    private int zip;
    
//  a Constructor to make a new address
    public Address(String streetAddress, String city, String state, int zip){
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
//  to view the address 
    public void viewAddress(){
        System.out.println("Street: "+ this.streetAddress+"\n"+ "City: "+ this.city+ "\n"+"State: "+ this.state+"\n"+ "Zip Code: "+ this.zip);
    }
    
//  Accessors and Mutators    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    

    
    
}
