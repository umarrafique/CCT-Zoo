/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;
import cctzoo.Setuphelper.SetUpDataUtility;

public class CCTZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       SetUpDataUtility setData = new SetUpDataUtility(); //creating new object of the class and calling its function
       Menu mnu = new Menu();      //creating new object of the menu
       setData.getItReady();       //intitilazing data in the file
       System.out.println("///////////  welcome to CCT Zoo  \\\\\\\\\\\\\\");
       System.out.println("//////////////////////////////////////////////");      
       mnu.Choices(setData);    //running menu
    }
    
}
