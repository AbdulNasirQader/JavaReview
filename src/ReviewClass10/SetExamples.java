package ReviewClass10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        //
        Set<String> qaJobs=new HashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("DataBase Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element "+qaJobs);
        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");

        System.out.println("Added duplicates "+qaJobs);

        //creating an Object and passing collection as a parameter to invoke parametrized constructor
        Set lset= new LinkedHashSet<>(qaJobs);//maintains the insertion order

        System.out.println("LinkedHashset ="+lset);

        Set<String> tSet= new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet ="+tSet);






    }
}
