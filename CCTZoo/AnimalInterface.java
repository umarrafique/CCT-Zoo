package cctzoo;

public interface AnimalInterface {
    
    //its making setter and getters of all fields required in the program
    public String GetName();
    
    public String getDateofBirth();

    public String getDateofArrival();

    public String getGender();

    public String getMedication();

    public String getVaccine();

    public int getOffSprings();

    public int getExibitNumber();
    
    
    public ZooKeeper getZooKeeper();

    public void setDateofBirth(String dob);

    public void setDateofArrival(String doa);

    public void setGender(String gender);

    public void setMedication(String medication);

    public void setVaccine(String vaccine);

    public void setOffSprings(int numberofOffsprings);

    public void setExibitNumber(int ExibitNumber);
    public void SetName(String Name);
    public void setZooKeeper(ZooKeeper keeper);

    public String GetType();
   
    public String toString() ;

}
