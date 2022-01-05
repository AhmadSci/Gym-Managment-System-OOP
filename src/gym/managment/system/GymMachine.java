package gym.managment.system;

/*
==============================================================================
            a class that represents all the Machines in the gym
==============================================================================
*/

import java.util.ArrayList;

public class GymMachine{
//  Attributes Declaration
    public String MachineName;
    public int MachineID;
    private int Price;
    public String Model;
    private String Status;
    static ArrayList<GymMachine> Machines = new ArrayList<>();

//  a Constructor for all the machines at the gym
    public GymMachine(String name, int Price, int ID, String Model, String status){
        
        this.Price = Price;
        this.MachineName = name;
        this.MachineID = ID;
        this.Model = Model;
        this.Status = status;
        Machines.add(this);
    }
    
//  overridden toString function to view a machine status
    @Override
   public String toString() {
        return ("Machine Name: "+this.MachineName+"\nMachine ID: "+ this.MachineID +"\nStatus: "+ this.getStatus() +"\nModel : " + this.getModel());
   }
    
//  to view all the states of the machines in the gym
    public static void viewMachines() {
        
        Machines.forEach(machine ->{
            System.out.println(machine.toString() + "\n");
        });
        
    }
    
//  a function to fix a broken machine, takes an enginner as input
    public void fixMachine(Engineer eng) {
        System.out.println(eng.name + " Will Fix the "+ this.MachineName +" Machine ASAP!");
    }

//  Accessors and Mutators
    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMachineName() {
        return MachineName;
    }

    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    public int getMachineID() {
        return MachineID;
    }

    public void setMachineID(int MachineID) {
        this.MachineID = MachineID;
    }

}
