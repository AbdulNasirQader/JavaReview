package ReviewClass10;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionViewOfMap {
    public static void main(String[] args) {

        var lmap= new LinkedHashMap<String, Double>();
        //to store values inside the map
        lmap.put("Milk",5.99);//Key+Value= Entry Object
        lmap.put("Eggs",6.50);
        lmap.put("Bread",2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber",2.50);
        lmap.put("Eggs",7.99);
        lmap.put("Tomato",2.50);

        Set<String> keys=lmap.keySet();

        for (var key:keys){
            System.out.println(key+" = "+lmap.get(key));
        }
        System.out.println(" ---------------------------------- ");

        Iterator<String> iter= keys.iterator();

        while (iter.hasNext()){
            //how to print Key+Value??
            String k=iter.next();
            System.out.println(k+" == "+lmap.get(k));

        }
        System.out.println(" ----------------------------- ");

        Collection<Double> values=lmap.values();

        //print all values
        for (double val:values){
            System.out.println(val+" ");
        }
    }
}
