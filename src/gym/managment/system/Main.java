
package gym.managment.system;

public class Main {


    public static void main(String[] args) {
        
        Manager Hany = new Manager("Hany", 25,1,1555555,99999,9,"Al-Mofatesh","Alexandria","Egypt",25958);
        Manager Khalid = new Manager("Khalid",27,2,1555555,99999,9,"Moharam-Bek","Alexandria","Egypt",20473);
        
        Khalid.manage();
        
        Coach Rawan = new Coach("Rawan", 259,1,1555555,99999,9,true,"Al-Mofatesh","Alexandria","Egypt",25958);
        Coach Radwa = new Coach("Radwa",17,2,1555555,99999,9,false,"Moharam-Bek","Alexandria","Egypt",20473);
        Coach Ameer = new Coach("Ameer", 15,1,1555555,99999,9,true,"Al-Mofatesh","Alexandria","Egypt",25958);
        Coach Ziad = new Coach("Ziad",97,2,1555555,99999,9,true,"Moharam-Bek","Alexandria","Egypt",20473);
        
        Barista Karim = new Barista("Karim",27,2,1555555,99999,9,"Moharam-Bek","Alexandria","Egypt",20473);
        
        Receptionist Farha = new Receptionist("Farha",25,4,1555555,99999,9,"Moharam-Bek","Alexandria","Egypt",20473);
        
        Engineer Ahmed = new Engineer("Ahmed", 27,2,1555555,99999,9,5,"Shatby","Alexandria","Egypt",23521);
        
        NormalCustomer hamada = new NormalCustomer("Ahmed", 19 , 122,  120);
        VipCustomer zika = new VipCustomer("Ziad", 20 , 123,  90);
        
        GymMachine pull = new GymMachine("Pull", 15000, 1, "1999","used");
        GymMachine push = new GymMachine("Pushs", 8000, 2, "2015","used");
        GymMachine legs = new GymMachine("legs", 17000, 3, "2022","new");
        GymMachine bench = new GymMachine("Bench", 50000, 4, "2021","new");
        GymMachine run = new GymMachine("Run", 5000, 5, "2022","new");
        
        pull.fixMachine(Ahmed);
        GymMachine.viewMachines();
        
    }
    
}
