/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo.Setuphelper;

// importing  class from cctzoo
import cctzoo.Animal;
import cctzoo.ZooKeeper;


public class Printing {
    
    
//Printing Animals List from Object Created
    public void displayAnimals(SetUpDataUtility setData) {
        for (Animal a : setData.currentAnimals) {
            System.out.println(a.toString());
        }
    }
//Printing Zookeeper List from Object Created
    public void displayZooKeepers(SetUpDataUtility setData, Printing printOut) {
        for (ZooKeeper zk : setData.currentZookeepers) {
            System.out.println(zk.toString());
            if(zk.GetAnimals().size()>0){
            System.out.println("-------Animals under Supervision--------");
            
            }
            for (Animal a : zk.GetAnimals()) {
                System.out.println("Animal Type: "+a.GetType()+ " , Animal Name : "+a.GetName() + " , Exibit Number : "+a.getExibitNumber());
            }
            System.out.println("\n\n");
        }
    }
}
