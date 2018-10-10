package cctzoo;

import java.util.ArrayList;
import java.util.List;


public class ZooKeeper {
    
    //declaring variables
    private int Idnumber;
    private String Name;
    private String DateofJoining;
    
    private List<Animal> animals;

     //initiazlize variables
    public ZooKeeper() {
        animals = new ArrayList<>();
        Idnumber = 0;

    }
//Get and Set methods  are called for all zoo keeper variables
    public int getIdNumber() {
        return this.Idnumber;
    }

    public String getName() {
        return this.Name;
    }

    public List<Animal> GetAnimals() {
        return this.animals;
    }

    public void SetAnimals(List<Animal> an) {
        this.animals = an;
    }

    public String getDateofJoining() {
        return this.DateofJoining;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDateofJoining(String Date) {
        this.DateofJoining = Date;
    }

    public void AssignAnimal(Animal a) {

        this.animals.add(a);
    }

    public void setIdNumber(int i) {
        this.Idnumber = i;

    }
//method to removal animal from zoo keeper
    public void RemoveAnimalat(int index) {
        try{
        this.animals.remove(index);
        System.out.println("Animal removed successfully");
        }catch(Exception e){
        System.out.println("Animal not found");
        }
    }
//method to add animal to zoo keeper according to Condition Max 10 Animals
    public boolean AddAnimal(Animal an) {
        List<Animal> tempanimals = animals;
        tempanimals.add(an);
        if (tempanimals.size() <= 10) {
            boolean mammal = false, reptile = false, insect = false, avian = false, aquatic = false;
            for (Animal a : tempanimals) {
                switch (a.GetType()) {
                    case "Mammal":
                        mammal = true;
                        break;
                    case "Mammal-Aquatic":
                        aquatic = true;
                        break;
                    case "Mammal-Avian":
                        avian = true;
                        break;
                    case "Mammal-Insect":
                        insect = true;
                        break;
                    case "Mammal-Reptile":
                        reptile = true;
                        break;
                    default:
                        break;
                }
            }
            int count = 0;
            if (mammal) {
                count++;
            }
            if (reptile) {
                count++;
            }
            if (insect) {
                count++;
            }
            if (avian) {
                count++;
            }
            if (aquatic) {
                count++;
            }

            if (count <= 3) {
                this.animals = tempanimals;
                return true;

            } else {
                return false;
            }
        } else {
            return false;
        }

    }
//method to add animal to zoo keeper according to Condition Max Three Animal Types
    public boolean validtoaddAnimals() {
        if (this.animals.size() <= 3) {
            boolean mammal = false, reptile = false, insect = false, avian = false, aquatic = false;
            for (Animal a : this.animals) {
                if (a.GetType().equals("Mammal")) {
                    mammal = true;
                } else if (a.GetType().equals("Mammal-Aquatic")) {
                    aquatic = true;
                } else if (a.GetType().equals("Mammal-Avian")) {
                    avian = true;
                } else if (a.GetType().equals("Mammal-Insect")) {
                    insect = true;
                } else if (a.GetType().equals("Mammal-Reptile")) {
                    reptile = true;
                }
            }
            int count = 0;
            if (mammal) {
                count++;
            }
            if (reptile) {
                count++;
            }
            if (insect) {
                count++;
            }
            if (avian) {
                count++;
            }
            if (aquatic) {
                count++;
            }

            if (count <= 3) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

   
    @Override
    public String toString() {
        return "Zookeeper Name = " + this.getName() + "\n"
                + "\r IdNumber = " + this.getIdNumber() + "\n"
                + "\r Date of Joining = " + this.getDateofJoining() + "\n";
    }
}
