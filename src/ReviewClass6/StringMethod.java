package ReviewClass6;

public class StringMethod {
    public static void main(String[] args) {

        String str="Hello";

        System.out.println(str.length());//5 letters
        System.out.println(str.toUpperCase());//HELLO uppercase
        System.out.println(str.charAt(1));//e first letter

        String newString=str.concat("friends");
        System.out.println(newString);//Hello friends

        System.out.println(str);//Hello
        str=str.toLowerCase();

        System.out.println(str);//hello

        //check if length of the String is more than 0
       boolean empty= str.isEmpty();
        System.out.println(empty);

        String str1=" Review B15 ";
        //remove any leading or trailing white space
        String newStr1=str.trim();

        System.out.println(str1);
        System.out.println(newStr1);
    }


}
