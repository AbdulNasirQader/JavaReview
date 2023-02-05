package ReviewClass6;

public class Garden {
    void hello(){
        String name="Adem";//local variable
        System.out.println("Hello "+name);
    }


    public static void main(String[] args) {
        //static String str; cannot use static for local variable

        //System.out,println(name); error: since local variable name is not visible


        Flower flower1= new Flower();
        //accessing variable of Flower class
        System.out.println(Flower.pretty);// correct way accessing static variable
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;//not the right away to access static variable but it is possible
        System.out.println("Hibiscus pretty? "+flower1.pretty);
        System.out.println(flower1.price);
        //flower1.size= error - since variables size does not exist in flower class

        //accessing method of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the flower class");
        Flower flower2= new Flower();
        System.out.println("Rose are pretty? "+flower2.pretty);
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;

        System.out.println(flower2.pretty);

        flower2.bloom();
        flower2.grow();
        flower2.smell();
        //flower2.stinks error - since method is not defined in the flower class

        Flower flower3= new Flower();

        //variable i - is a local to it's block of code - loop
        for (int i = 1; i < 3; i++) {
            System.out.println(i);
        }
       // System.out.println(i); error - since i
    }
}
