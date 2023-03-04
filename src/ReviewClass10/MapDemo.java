package ReviewClass10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

       var grocery1= new HashMap<String, Double>();
        //to store values inside the map
        grocery1.put("Milk",5.99);//Key+Value= Entry Object
        grocery1.put("Eggs",6.50);
        grocery1.put("Bread",2.99);
        grocery1.put("Tea",4.99);
        grocery1.put("Cucumber",2.50);
        grocery1.put("Eggs",7.99);
        grocery1.put("Tomato",2.50);
        grocery1.put("Tomato",2.50);


       double teaPrice=grocery1.get("Tea");//Returns the value to which the specified
        System.out.println(teaPrice);

        System.out.println(grocery1);

        int size=grocery1.size();
        System.out.println("Number of entry objects = "+size);

        var lmap= new LinkedHashMap<String, Double>();
        //to store values inside the map
        lmap.put("Milk",5.99);//Key+Value= Entry Object
        lmap.put("Eggs",6.50);
        lmap.put("Bread",2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber",2.50);
        lmap.put("Eggs",7.99);
        lmap.put("Tomato",2.50);
    }
}
