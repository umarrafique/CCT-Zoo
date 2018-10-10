package cctzoo.Setuphelper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoredDataUtility {

    // Saving filepath  in a string called file
    public String file = System.getProperty("user.dir")+"/src/cctzoo/cctzoo.txt";
    
    //declaring array of string of all fields in file
    public String[] AnimalType, animalnames, Aquaticnames, reptilenames, Insectnames, aviannames, ZooKeeperNames, Medications, Vaccines, Dates;

    public void ReadfromFile() {
        FileReader fr = null;
// try ctach statment for file reading
        try {

            fr = new FileReader(this.file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String content = null;
            boolean concat = false;
            
            // Reading line by line the file and trimming into different fields
            while ((line = br.readLine()) != null) {
                if (line.startsWith("(") && line.endsWith("}")) {
                    content = line.trim();
                } else if (line.startsWith("(") && !line.endsWith("}")) {
                    content = line;
                    concat = true;
                }
                if (!line.startsWith("(") && !line.endsWith("}")) {
                    content = content + line.trim();
                    concat = true;
                }
                if (!line.startsWith("(") && line.endsWith("}")) {
                    content = content + line.trim();
                    concat = false;
                }
                if (!concat) {
                    String type = content.substring(1, content.indexOf(")"));
                    content = content.substring(content.indexOf(")") + 2, content.indexOf("}"));
                    String[] list = content.split(",");

                    switch (type) {
                        case "AnimalType":
                            this.AnimalType = list;
                            break;
                        case "animalnames":
                            this.animalnames = list;
                            break;
                        case "Aquaticnames":
                            this.Aquaticnames = list;
                            break;
                        case "reptilenames":
                            this.reptilenames = list;
                            break;
                        case "Insectnames":
                            this.Insectnames = list;
                            break;
                        case "aviannames":
                            this.aviannames = list;
                            break;
                        case "names":
                            this.ZooKeeperNames = list;
                            break;
                        case "Vaccines":
                            this.Vaccines = list;
                            break;
                        case "Medications":
                            this.Medications = list;
                            break;
                        case "Dates":
                            this.Dates = list;
                            break;
                        default:
                            break;
                    }

                }

            }

            // closing your buffered readers
            br.close();

            // Catching any posible exception
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
}
