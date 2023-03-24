package ReviewClass12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {

    public static void main(String[] args) {

        /*
        Exception can occur because of two main reasons the mistake of programmer
        or because of the external resources on which you program is dependent

        when exceptions occur because of human error or can be avoided by simply writing
        good code and may if else conditions they are called unchecked exception
         */
        System.out.println(10/0);

        try {
            FileInputStream fileInputStream= new FileInputStream("Files/Book1.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        FileNotFoundException e = new FileNotFoundException();
    }
}