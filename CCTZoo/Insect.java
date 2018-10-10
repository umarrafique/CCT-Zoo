/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

//implementing AnimalInterface and Extending Animal Class

public class Insect extends Animal implements AnimalInterface{
    //creating variable for Insect(Special Field)
    
    boolean Flying;
    
    //creating a method to return Flying varible
    public String getFlying(){
        if(this.Flying)
            return "yes";
        else
            return "no";
    }
    
    //creating a method to set Flying
    public void SetFlying(boolean fly){
    
        this.Flying=fly;
    }
    
      //Overriding methods from Animal Interface
   @Override
    public String getDateofBirth() {
        return super.getDateofBirth();

    }

    @Override
    public String getDateofArrival() {
        return super.getDateofArrival();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public String getMedication() {
        return super.getMedication();
    }

    @Override
    public String getVaccine() {
        return super.getVaccine();
    }

    @Override
    public int getOffSprings() {
        return super.getOffSprings();
    }

    @Override
    public int getExibitNumber() {
        return super.getExibitNumber();
    }

    @Override
    public void setDateofBirth(String dob) {
        super.setDateofBirth(dob); 
    }

    @Override
    public void setDateofArrival(String doa) {
        super.setDateofArrival(doa);
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public void setMedication(String medication) {
        super.setMedication(medication);
    }

    @Override
    public void setVaccine(String vaccine) {
        super.setVaccine(vaccine);
    }

    @Override
    public void setOffSprings(int numberofOffsprings) {
      super.setOffSprings(numberofOffsprings);
    }

    @Override
    public void setExibitNumber(int ExibitNumber) {
        super.setExibitNumber(ExibitNumber);
    }

    @Override
    public String GetType() {
        return "Mammal-Insect";
    }

    @Override
    public String GetName() {
        return super.GetName();
    }

    @Override
    public void SetName(String Name) {
        super.SetName(Name);
    }

    @Override
    public String toString() {
        return "Animal Type = " + this.GetType() + "\n"
                + "ExibitNumber = " + this.getExibitNumber() + "\n"
                + "Name = " + this.GetName() + "\n"
                + "Gender = " + this.getGender() + "\n"
                + "Flying = " + this.getFlying() + "\n"
                + "Medication = " + this.getMedication() + "\n"
                + "Vaccine : " + this.getVaccine()+"\n"
                + "Date of Birth = " + this.getDateofBirth() + "\n"
                + "Date of Arrival = " + this.getDateofArrival() + "\n"
                + "Number of OffSprings = " + this.getOffSprings() + "\n"
                 + "Keeper = " + super.getZooKeeper().toString() + "\n";
    }

    @Override
    public ZooKeeper getZooKeeper() {
        return super.getZooKeeper();
    }

    @Override
    public void setZooKeeper(ZooKeeper keeper) {
        super.setZooKeeper(keeper); 
    }  
}
