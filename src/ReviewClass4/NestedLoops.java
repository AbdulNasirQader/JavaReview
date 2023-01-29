package ReviewClass4;

public class NestedLoops {
    public static void main(String[] args) {

        //nested loop - loop inside another loop
       // inner loop ALWAYS depends on outer loop
        for (int i = 1; i <=3 ; i++) {// outer loop

            System.out.println(i);

            for (int j = 1; j <=4 ; j++) {// inner loop

                System.out.println(j);

            }
        }
        System.out.println("------------------");
        // outer loop controls numbers of complete irexecutions for inner loop
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");

            for (int j = 1; j <=2 ; j++) {// inner
                System.out.println("Bye");

            }

        }
    }
}