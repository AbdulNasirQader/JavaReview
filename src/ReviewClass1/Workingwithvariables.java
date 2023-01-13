package ReviewClass1;

public class Workingwithvariables {
    public static void main(String[] args) {

        //create a variable and store value into it
        //declared a variable and initialized it
        int number=10;

        //declared a variable
        int num; //declaration of a variable happens only once
        num=100; //initialize the variable
        num=200; //reassign the value;
        num=2000;
        num=5000;
        // num=30.01;
        System.out.println(num);//5000

        boolean hungry=false;
        hungry=true;
        // hungry= "yes"; error

        String myString="hello";
        String name="Artem";
        String address="123 Test Drive";

        //Hello Artem
        System.out.println(myString+" "+name);
        int age=21;

        //artem is 21 years old
        System.out.println(name +" is "+age+" years old");

        /*
        if you want to attach string to anything;

        string to another string
        string to int
        string to boolean
        string to char....

        we use + --> acts as concatenation

         */

        //when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;

        //14 December
        System.out.println(day+" "+month); //1 December

        char date='1';
        System.out.println(date+month); // 63

        System.out.println(date+day);


    }
}
