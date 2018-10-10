package cctzoo;

import cctzoo.Setuphelper.Printing;
import cctzoo.Setuphelper.SetUpDataUtility;
import cctzoo.Setuphelper.StoredDataUtility;
import java.util.List;

public class ChangeZoo {
    
    //StoredDataUtility sDU = new StoredDataUtility();
    
    
    void addMoreAnimals(SetUpDataUtility setData, Printing printOut) {
        int i = 1;
        System.out.println("Select the type of Animal you want to add");
        for (String s : setData.sDU.AnimalType) {
            System.out.println("Enter " + i + " for " + s);
            i++;
        }
        int choice = setData.Getint("Enter your choice", 1, i);
        
        switch (choice) {
            case 1:
                Animal a = new Animal();
                a = (Animal) setData.GetAnimalDetailsfromUser(a, a.GetType());
                
                setData.currentAnimals.add(a);
                System.out.println("Animal Added Successfully!!");
                System.out.println(a.toString());
                break;
            case 2:
                Reptile r = new Reptile();
                r = (Reptile) setData.GetAnimalDetailsfromUser(r, r.GetType());
                setData.currentAnimals.add(r);
                System.out.println("Animal Added Successfully!!");
                System.out.println(r.toString());
                break;
            case 3:
                Avian av = new Avian();
                av = (Avian) setData.GetAnimalDetailsfromUser(av, av.GetType());
                av.SetFlight(setData.Getint("Please enter the flight height of the bird", 1, 100));
                setData.currentAnimals.add(av);
                System.out.println("Animal Added Successfully!!");
                System.out.println(av.toString());
                break;
            case 4:
                Aquatic aq = new Aquatic();
                aq = (Aquatic) setData.GetAnimalDetailsfromUser(aq, aq.GetType());
                aq.setSwimmingHeight(setData.Getint("Please enter the swimming depth", 1, 1000));
                setData.currentAnimals.add(aq);
                System.out.println("Animal Added Successfully!!");
                System.out.println(aq.toString());
                break;
            case 5:
                Insect is = new Insect();
                is = (Insect) setData.GetAnimalDetailsfromUser(is, is.GetType());
                int fly = setData.Getint("Please enter 1 if it can fly or 2 if it cannot", 1, 2);
                if (choice == 1) {
                    is.SetFlying(true);
                } else {
                    is.SetFlying(false);
                }
                setData.currentAnimals.add(is);
                System.out.println("Animal Added Successfully!!");
                System.out.println(is.toString());
                break;
            default:
                break;
        }
    }
    
    void updateAnimals(SetUpDataUtility setData, Printing printOut) {
        int userInput;
        Animal an = searchAnimals(setData);
        if (an.getExibitNumber() != 0) {
            userInput = setData.Getint("Select \n"
                    + " 1 to update Name \n"
                    + " 2 to update medication \n"
                    + " 3 to update vaccine \n "
                    + " 4 to update Date of Birth \n "
                    + " 5 to update Date of Arrival \n"
                    + " 6 to update No of OffSprings \n "
                    + " 7 to update zooKeeper", 1, 7);
            switch (userInput) {
                case 1:
                    an.SetName(setData.GetAnimalNamefromUser(an.GetType()));
                    break;
                case 2:
                    an.setMedication(setData.GetMedicationfromUser());
                    break;
                case 3:
                    an.setVaccine(setData.GetVaccinefromUser());
                    break;
                case 4:
                    an.setDateofBirth(setData.GetDatefromUser());
                    break;
                case 5:
                    an.setDateofArrival(setData.GetDatefromUser());
                    break;
                case 6:
                    an.setOffSprings(setData.Getint("Please enter the number of OffSprings", 1, 5));
                    break;
                case 7:
                    setData.removeanimalfromZooKeeper(an.getZooKeeper().getIdNumber(), an);
                    an = (Animal) setData.updateZooKeeper(an);
                    break;
                default:
                    break;
            }
            for (int i = 0; i < setData.currentAnimals.size(); i++) {
                
                if (setData.currentAnimals.get(i).getExibitNumber() == an.getExibitNumber()) {
                    setData.currentAnimals.set(i, an);
                    System.out.println("Animal Updated Successfully!");
                    break;
                }
                
            }
//            for(Animal a:setData.currentAnimals){
//                if(a.getExibitNumber()==an.getExibitNumber()){
//                a=an;
//                System.out.println("Animal Updated Successfully!");
//                break;
//                }
//            }
        }
    }
    
    public void addMoreZooKeeprs(SetUpDataUtility setData, Printing printOut) {
        ZooKeeper zk = new ZooKeeper();
        zk.setIdNumber(setData.getMaximumKeeperNumber());
        zk.setName(GetnamefromUser(setData));
        zk.setDateofJoining(setData.GetDatefromUser());
        
    }
    
    public String GetnamefromUser(SetUpDataUtility setData) {
        int k = 1;
        //System.out.println("Select the Date of Birth of Animal you want to add");
        for (String s : setData.sDU.ZooKeeperNames) {
            System.out.println("Enter " + k + " for " + s);
            k++;
        }
        int userinput = setData.Getint("Select name of the ZooKeeper you want to add", 1, k - 1);
        return setData.sDU.ZooKeeperNames[userinput - 1];
    }
    
    public void updateZooKeepers(SetUpDataUtility setData, Printing printOut) {
        int userinput;
        ZooKeeper zk = this.searchZooKeepers(setData, printOut);
        if (zk.getIdNumber() != 0) {
            
            userinput = setData.Getint("Select \n"
                    + " 1 to Update Name \n"
                    + " 2 to Update Date of Joining \n "
                    + " 3 to Update Animals", 1, 7);
            
            switch (userinput) {
                case 1:
                    zk.setName(this.GetnamefromUser(setData));
                    break;
                case 2:
                    zk.setDateofJoining(setData.GetDatefromUser());
                    break;
                case 3:
                    int uin = setData.Getint("Enter 1 to REMOVE AND 2 to ADD an Animal", 1, 2);
                    if (uin == 1) {
                        int i = 1;
                        for (Animal a : zk.GetAnimals()) {
                            System.out.println("Enter " + i + "to remove " + a.GetName() + "Exibit Number : " + a.getExibitNumber());
                            i++;
                        }
                        int selection = setData.Getint("Enter the number of the animal to remove", 1, i - 1);
                        List<Animal> ani = zk.GetAnimals();
                        setData.removeanimalfromZooKeeper(zk.getIdNumber(), ani.get(selection - 1));
                        System.out.println("Animal removed Successfully");
                        
                    } else {
                        setData.AddanimaltoZooKeeper(zk.getIdNumber());
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
    public ZooKeeper searchZooKeepers(SetUpDataUtility setData, Printing printOut) {
        int idnumber = setData.Getint("Enter the ID number of the Zoo Keeper", 1, setData.getMaximumKeeperNumber() - 1);
        ZooKeeper zk = setData.GetZooKeeperbyId(idnumber);
        if (zk.getIdNumber() == 0) {
            System.out.println("Sorry no Zoo Keeper found!!");
            
        }
        return zk;
    }
    
    public Animal searchAnimals(SetUpDataUtility setData) {
        int exibitnumber = setData.Getint("Enter the Exibit number of the animal", 1, setData.getMaximumAnimalNumber() - 1);
        boolean found = false;
        Animal an = new Animal();
        for (Animal a : setData.currentAnimals) {
            if (a.getExibitNumber() == exibitnumber) {
                an = a;
                System.out.println(a.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry no Animal found!!");
        }
        return an;
    }
    
}
