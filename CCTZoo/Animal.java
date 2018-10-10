package cctzoo;
//implementing Animal Interface
public class Animal implements AnimalInterface {
    
    //creating fields for animal

    private int ExibitNumber;
    private String Name;
    private String DateofBirth;
    private String DateofArrival;
    private String Gender;
    private String Medication;
    private String Vaccine;
    private int numberofOffsprings;
    private ZooKeeper keeper;

    public Animal() {
        ////intitilazing Exibit number as a zero
        this.ExibitNumber=0;
    }
    
    //all below methods are override from animal interface

    @Override
    public String getDateofBirth() {
        return this.DateofBirth;

    }

    @Override
    public String getDateofArrival() {
        return this.DateofArrival;
    }

    @Override
    public String getGender() {
        return this.Gender;
    }

    @Override
    public String getMedication() {
        return this.Medication;
    }

    @Override
    public String getVaccine() {
        return this.Vaccine;
    }

    @Override
    public int getOffSprings() {
        return this.numberofOffsprings;
    }

    @Override
    public int getExibitNumber() {
        return this.ExibitNumber;
    }

    @Override
    public void setDateofBirth(String dob) {
        this.DateofBirth = dob;
    }

    @Override
    public void setDateofArrival(String doa) {
        this.DateofArrival = doa;
    }

    @Override
    public void setGender(String gender) {
        this.Gender = gender;
    }

    @Override
    public void setMedication(String medication) {
        this.Medication = medication;
    }

    @Override
    public void setVaccine(String vaccine) {
        this.Vaccine = vaccine;
    }

    @Override
    public void setOffSprings(int numberofOffsprings) {
        this.numberofOffsprings = numberofOffsprings;
    }

    @Override
    public void setExibitNumber(int ExibitNumber) {
        this.ExibitNumber = ExibitNumber;
    }

    @Override
    public String GetType() {
        return "Mammal";
    }

    @Override
    public String GetName() {
        return this.Name;
    }

    @Override
    public void SetName(String Name) {
        this.Name = Name;
    }
    

    @Override
    public String toString() {
        return "Animal Type = " + this.GetType() + "\n"
                + "ExibitNumber = " + this.getExibitNumber() + "\n"
                + "Name = " + this.GetName() + "\n"
                + "Gender = " + this.getGender() + "\n"
                + "Medication = " + this.getMedication() + "\n"
                + "Vaccine : " + this.getVaccine()+"\n"
                + "Date of Birth = " + this.getDateofBirth() + "\n"
                + "Date of Arrival = " + this.getDateofArrival() + "\n"
                + "Number of OffSprings = " + this.getOffSprings() + "\n"
                 + "Keeper = " + this.getZooKeeper().toString() + "\n";
    }

    @Override
    public ZooKeeper getZooKeeper() {
        return this.keeper;
    }

    @Override
    public void setZooKeeper(ZooKeeper keeper) {
      
        this.keeper = keeper;
    }

}
