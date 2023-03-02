package sem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Components {
        int id;
        String manufacturer;
        String model_name;
        String RAM;
        String HDD;
        String OS;
        int price;

    public Components(int id, String manufacturer, String model_name, String RAM, String HDD, String OS, int price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model_name = model_name;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.price = price;
    }
    
    public String toString() {
        return "id: " + id + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Model_name: " + model_name + "\n" +
                "RAM: " + RAM + "\n" +
                "HDD: " + HDD + "\n" +
                "OS: " + OS + "\n" +
                "Price: " + price + "\n";
    }
    
    public List<Components> findNotebook(HashSet<Components> notebookSet, String str) {
        List<Components> notebookList = new ArrayList<Components>();
        for (Components i : notebookSet) {
            if (i.manufacturer.equals(str)) {
                notebookList.add(i);
            } else if (i.RAM.equals(str)) {
                notebookList.add(i);
            } else if (i.HDD.equals(str)) {
                notebookList.add(i);
            } else if (i.OS.equals(str)) {
                notebookList.add(i);
            }
        }
        return notebookList;
      }
}
