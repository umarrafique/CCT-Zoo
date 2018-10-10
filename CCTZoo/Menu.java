package cctzoo;


//import Java Classes from from SetupHelper
import cctzoo.Setuphelper.Printing;
import cctzoo.Setuphelper.SetUpDataUtility;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    
// creating new objects of Printing and Chanzoo Classes
    Printing printOut = new Printing();
    ChangeZoo changezoo = new ChangeZoo();
    
    //New Scanner for User Input
    Scanner kB = new Scanner(System.in);

   
    // Method to Print Main Menu from Object Created
    public void Choices(SetUpDataUtility setData) {
        System.out.println("Please make your choice from the options below");
        System.out.println();
        System.out.println("Enter '1' To View All Animals");
        System.out.println("Enter '2' To Search Animal By Exibit Number");
        System.out.println("Enter '3' To View All Zookeepers");
        System.out.println("Enter '4' To Search Zookeeper By ID");
        System.out.println("Enter '5' To Add New Animal");
        System.out.println("Enter '6' To Add New Zookeeper");
        System.out.println("Enter '7' To Update Animal");
        System.out.println("Enter '8' To Update Keepers");
        System.out.println("Enter '0' To EXIT");
        
// after printing taking Inpur from user and Calling it Fucntion
        int choice = kB.nextInt();
        
        // try catch for Invalid Input
          try {
            switch (choice) {
                              case 1:
                    printOut.displayAnimals(setData);
                    System.out.println();
                    Choices(setData);
                    break;
                case 2:
                    changezoo.searchAnimals(setData);
                    System.out.println();
                    Choices(setData);
                    break;
                case 3:
                    printOut.displayZooKeepers(setData, printOut);
                    System.out.println();
                    Choices(setData);
                    break;
                case 4:
                    changezoo.searchZooKeepers(setData, printOut);
                    System.out.println();
                    Choices(setData);
                    break;
                case 5:
                    changezoo.addMoreAnimals(setData, printOut);
                    System.out.println();
                    Choices(setData);
                    break;
                case 6:
                    changezoo.addMoreZooKeeprs(setData, printOut);
                    System.out.println();
                    Choices(setData);
                    break;
                case 7:
                    changezoo.updateAnimals(setData, printOut);
                    System.out.println();
                    Choices(setData);
                    break;
                case 8:
                    changezoo.updateZooKeepers(setData, printOut);
                    System.out.println();
                    Choices(setData);
                    break;
                case 0:
                    System.out.println("BYE.");
                    System.exit(0);
                default:
                    System.out.println("no options match your input");
                    System.out.println("please try again");
                    Choices(setData);

            }
        } catch (InputMismatchException e) {
            System.out.println("please try again");
            kB.next();
            Choices(setData);
        }
    }
}
