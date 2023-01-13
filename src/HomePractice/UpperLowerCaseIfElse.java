package HomePractice;

import java.util.Scanner;

public class UpperLowerCaseIfElse {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a character:");
        char c = scan.next().charAt(0);

        if (Character.isUpperCase(c)){
            System.out.println("Uppercase");
        }else if (Character.isLowerCase(c)){
            System.out.println("Lowercase");
        }else{
            System.out.println("Neither");
        }



        }
    }

