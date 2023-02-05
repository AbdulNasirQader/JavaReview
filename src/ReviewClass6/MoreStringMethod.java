package ReviewClass6;

public class MoreStringMethod {
    public static void main(String[] args) {

        String myString="Today is February 2";//
       //Split this string around matches of the given regular expression
        String[] strArray=myString.split(" ");

        for(String s:strArray){
            System.out.println(s);
        }

        System.out.println(" ---------------------- ");

        System.out.println(myString);//today is february 2

       String newStr =myString.substring(9);
        System.out.println(newStr);

        newStr=myString.substring(9,17);
        System.out.println(newStr);//February

       int index= newStr.indexOf('b');
        System.out.println("index of character b is = "+index);

        String anotherStr="Today is Thursday";

        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is ="+index);

    }
}
