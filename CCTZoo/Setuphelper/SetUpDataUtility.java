package cctzoo.Setuphelper;


// importing  class from cctzoo
import cctzoo.Animal;
import cctzoo.AnimalInterface;
import cctzoo.Aquatic;
import cctzoo.Avian;
import cctzoo.Insect;
import cctzoo.Reptile;
import cctzoo.ZooKeeper;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SetUpDataUtility {
// intializing amount of Animals and Zoo keepers for Program
    int amtOfData = 100; // amount of Animals
    int amtOfkeepers = 40;
 
    
    //creating object of storedatautlity class to call functions
    public StoredDataUtility sDU = new StoredDataUtility();

    //array list for animals imported from cctzoo
    public ArrayList<Animal> currentAnimals = new ArrayList();
    
      //array list for zoo keeper imported from cctzoo
    public ArrayList<ZooKeeper> currentZookeepers = new ArrayList();
 
//New Random to pick data
    Random rG = new Random();

 // Getting ready Data
    public void getItReady() {
        System.out.println("Path ="+ System.getProperty("user.dir"));
        sDU.ReadfromFile();
        createData();
        fillZooKeepers();
        fillAnimals();
        Assignanimals();

    }

    //creating new anmals and Zoo keeper from File data
    public void createData() {
        for (int i = 0; i < amtOfData; i++) {
            currentAnimals.add(new Animal());

        }
        for (int i = 0; i < amtOfkeepers; i++) {

            currentZookeepers.add(new ZooKeeper());

        }
    }

    

  // filling zoo keepers randonmly
    public void fillZooKeepers() {
        currentZookeepers.forEach((zk) -> {
            zk.setName(sDU.ZooKeeperNames[rG.nextInt(sDU.ZooKeeperNames.length)]);
            zk.setDateofJoining(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
            zk.setIdNumber(this.getMaximumKeeperNumber());
        });
    }

  // fill animals randomnly acording to thier fields
    public void fillAnimals() {
        for (int i = 0; i < amtOfData; i++) {
            int random = rG.nextInt(15);
            if (random <= 3) {
                Animal a = new Animal();
                a.SetName(sDU.animalnames[rG.nextInt(sDU.animalnames.length)]);
                a.setDateofArrival(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setDateofBirth(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setOffSprings(rG.nextInt(5));
                a.setMedication(sDU.Medications[rG.nextInt(sDU.Medications.length)]);
                a.setVaccine(sDU.Vaccines[rG.nextInt(sDU.Vaccines.length)]);
                int gender = rG.nextInt(10);
                if (gender <= 5) {
                    a.setGender("Male");
                } else {
                    a.setGender("Female");
                }
                a.setExibitNumber(this.getMaximumAnimalNumber());
                currentAnimals.set(i, a);
            } else if (random > 3 && random <= 6) {
                Reptile a = new Reptile();
                a.SetName(sDU.reptilenames[rG.nextInt(sDU.reptilenames.length)]);
                a.setDateofArrival(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setDateofBirth(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setOffSprings(rG.nextInt(5));
                a.setMedication(sDU.Medications[rG.nextInt(sDU.Medications.length)]);
                a.setVaccine(sDU.Vaccines[rG.nextInt(sDU.Vaccines.length)]);
                int gender = rG.nextInt(10);
                if (gender <= 5) {
                    a.setGender("Male");
                } else {
                    a.setGender("Female");
                }
                a.setExibitNumber(this.getMaximumAnimalNumber());
                currentAnimals.set(i, a);
            } else if (random > 6 && random <= 9) {
                Avian a = new Avian();
                a.SetName(sDU.aviannames[rG.nextInt(sDU.aviannames.length)]);
                a.setDateofArrival(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setDateofBirth(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setOffSprings(rG.nextInt(5));
                a.setMedication(sDU.Medications[rG.nextInt(sDU.Medications.length)]);
                a.setVaccine(sDU.Vaccines[rG.nextInt(sDU.Vaccines.length)]);
                
                a.SetFlight(rG.nextInt(100));
                int gender = rG.nextInt(10);
                if (gender <= 5) {
                    a.setGender("Male");
                } else {
                    a.setGender("Female");
                }
                a.setExibitNumber(this.getMaximumAnimalNumber());
                currentAnimals.set(i, a);
            } else if (random > 9 && random <= 12) {
                Aquatic a = new Aquatic();
                a.SetName(sDU.Aquaticnames[rG.nextInt(sDU.Aquaticnames.length)]);
                a.setDateofArrival(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setDateofBirth(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setOffSprings(rG.nextInt(5));
                a.setMedication(sDU.Medications[rG.nextInt(sDU.Medications.length)]);
                a.setVaccine(sDU.Vaccines[rG.nextInt(sDU.Vaccines.length)]);
                 a.setSwimmingHeight(rG.nextInt(1000));
                int gender = rG.nextInt(10);
                if (gender <= 5) {
                    a.setGender("Male");
                } else {
                    a.setGender("Female");
                }
                a.setExibitNumber(this.getMaximumAnimalNumber());
                currentAnimals.set(i, a);
            } else {
                Insect a = new Insect();
                a.SetName(sDU.Insectnames[rG.nextInt(sDU.Insectnames.length)]);
                a.setDateofArrival(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setDateofBirth(sDU.Dates[rG.nextInt(sDU.Dates.length)]);
                a.setOffSprings(rG.nextInt(5));
                a.setMedication(sDU.Medications[rG.nextInt(sDU.Medications.length)]);
                a.setVaccine(sDU.Vaccines[rG.nextInt(sDU.Vaccines.length)]);
                a.SetFlying(rG.nextBoolean());
                int gender = rG.nextInt(10);
                if (gender <= 5) {
                    a.setGender("Male");
                } else {
                    a.setGender("Female");
                }
                a.setExibitNumber(this.getMaximumAnimalNumber());
                currentAnimals.set(i, a);
            }
        }
    }

   //method to assign animal to zoo keeper
    public void Assignanimals() {
        for (Animal a : currentAnimals) {
            while (true) {
                int index = rG.nextInt(currentZookeepers.size());
                boolean check = currentZookeepers.get(index).AddAnimal(a);
                if (check) {
                    a.setZooKeeper(currentZookeepers.get(index));
                    break;
                }
            }
        }

    }
//
//    public String makeTime() {
//        String theTime = "" + (rG.nextInt(23) + 1) + ":" + (rG.nextInt(60) + 1);
//        if (theTime.charAt(2) != ':') {
//            theTime = "0" + theTime;
//            if (theTime.length() != 5) {
//                theTime += "0";
//            }
//        }
//        return theTime;
//    }

    // checking
    public int getMaximumAnimalNumber() {
        int i = 0;
        for (Animal a : currentAnimals) {
            if (a.getExibitNumber() > i) {
                i = a.getExibitNumber();
            }
        }
        i++;
        return i;
    }

    public int getMaximumKeeperNumber() {
        int i = 0;
        for (ZooKeeper zk : currentZookeepers) {
            if (zk.getIdNumber() > i) {
                i = zk.getIdNumber();
            }
        }
        i++;
        return i;
    }
// checking user input for maximium and minimum
    public int Getint(String message, int min, int max) {
        Scanner s = new Scanner(System.in);
        int value = 0;
        while (true) {
            try {
                System.out.println(message);
                value = Integer.parseInt(s.next().trim());
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.println("ERROR !!! in input, please enter integer less than " + max);

                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR !!! in input, please enter integers only");
            }
        }
        return value;
    }
//adding new animal
    public AnimalInterface GetAnimalDetailsfromUser(AnimalInterface a, String type) {
        int Gender = this.Getint("Enter 1 for Male and 2 for Female", 1, 2);
        //int userinput=0;
        String gender;
        if (Gender == 1) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        a.setExibitNumber(this.getMaximumAnimalNumber());
        a.setGender(gender);
        System.out.println("Exibit Number of the new Animal = " + a.getExibitNumber());
        a.SetName(this.GetAnimalNamefromUser(a.GetType()));
        a.setDateofBirth(this.GetDatefromUser());
        a.setDateofArrival(this.GetDatefromUser());
        a.setMedication(GetMedicationfromUser());
        a.setVaccine(this.GetVaccinefromUser());
        a.setOffSprings(this.Getint("Enter the number of OffSprings or Enter 0 for None", 0, 99));
        a = this.updateZooKeeper(a);

        return a;
    }
// Single Method to get date input from user like DOB and date of Arrival/joining
    public String GetDatefromUser() {
        String date = "";
        
        System.out.println("Enter the date of Joinig");
        int year = this.Getint("Enter the Year", 1970, 2018);
        int month = this.Getint("Enter the Month", 1, 12);
        int day;

        if (month == 2) {
            if (year % 4 == 0) {
                day = this.Getint("Enter the day of the month", 1, 29);

            } else {
                day = this.Getint("Enter the day of the month", 1, 28);

            }
        } else if (month == 4 || month == 9 || month == 6 || month == 11) {
            day = this.Getint("Enter the date of the month", 1, 30);

        } else {
            day = this.Getint("Enter the date of the month", 1, 31);

        }
        date = day + "/" + month + "/" + year;

        return date;

    }
// to add new animal and its type into  the list
    public String GetAnimalNamefromUser(String type) {
        String name = "";

        String[] set;
        int j = 1;
        if (type.equals("Mammal-Reptile")) {
            set = sDU.reptilenames;
        } else if (type.equals("Mammal-Aquatic")) {
            set = sDU.Aquaticnames;
        } else if (type.equals("Mammal-Insect")) {
            set = sDU.Insectnames;
        } else if (type.equals("Mammal-Avian")) {
            set = sDU.aviannames;
        } else {
            set = sDU.animalnames;
        }
        int userinput = 0;
        //System.out.println("Select the name of Animal you want to add");
        for (String s : set) {
            System.out.println("Enter " + j + " for " + s);
            j++;
        }
        userinput = this.Getint("Select the Serial Number of Animal you want to add", 1, j - 1);
        System.out.println("First Enter the Date of Birth and Then");
        return set[userinput - 1];
    }
// getting medication
    public String GetMedicationfromUser() {
        int m = 1;

        for (String s : sDU.Medications) {
            System.out.println("Enter " + m + " for " + s);
            m++;
        }
        int userinput = this.Getint("Select Medication from above List or Press 1 for NO MEDICATION", 1, m - 1);
        return sDU.Medications[userinput - 1];
    }
// geeting vacination
    public String GetVaccinefromUser() {
        int v = 1;

        for (String s : sDU.Vaccines) {
            System.out.println("Enter " + v + " for " + s);
            v++;
        }
        int userinput = this.Getint("Select Vacccine from above List or Press 1 for NO VACCINE", 1, v - 1);
        return sDU.Vaccines[userinput - 1];

    }
// updating zoo keeper
    public AnimalInterface updateZooKeeper(AnimalInterface a) {
        boolean check = false;
        while (!check) {
            int z = 1;
            for (ZooKeeper zk : this.currentZookeepers) {
                System.out.println("Enter " + z + " for " + zk.getName());
                z++;
            }
            int userinput = this.Getint("Select the Zookeeper to assign this animal to", 1, z - 1);
            if (this.currentZookeepers.get(userinput - 1).AddAnimal((Animal) a)) {
                a.setZooKeeper(currentZookeepers.get(userinput - 1));
                check = true;
            }
        }
        return a;
    }
// removal of zoo keeper
    public void removeanimalfromZooKeeper(int ZooKeeperid, Animal a) {

        for (ZooKeeper zk : this.currentZookeepers) {
            if (zk.getIdNumber() == ZooKeeperid) {

                List<Animal> list = zk.GetAnimals();
                list.remove(a);
                zk.SetAnimals(list);
            }
        }
    }
// asigning zoo keeper to new animal
    public ZooKeeper AddanimaltoZooKeeper(int id) {
        ZooKeeper zk = GetZooKeeperbyId(id);
        if (zk.getIdNumber() != 0) {
            int i = 1;
            for (Animal a : this.currentAnimals) {
                System.out.println("Enter " + i + " for " + a.getExibitNumber() + " Name: " + a.GetName());
                i++;
            }
            int selection = this.Getint("Enter your choice", 1, i - 1);
            Animal a = this.currentAnimals.get(selection - 1);
            if (zk.AddAnimal(a)) {
                a.setZooKeeper(zk);

            } else {
                System.out.println("Animal cannot be added!");
            }
        } else {
            System.out.println("Sorry no Zoo Keeper found!!");
        }
        return zk;
    }
// to search zoo keeeper by id number
    public ZooKeeper GetZooKeeperbyId(int id) {
        boolean found = false;
        for (ZooKeeper zk : this.currentZookeepers) {
            if (zk.getIdNumber() == id) {
                System.out.println(zk.toString());
                found = true;
                return zk;
            }
        }
        if (!found) {
            System.out.println("Sorry no Zoo Keeper found!!");
        }
        return new ZooKeeper();
    }
}
