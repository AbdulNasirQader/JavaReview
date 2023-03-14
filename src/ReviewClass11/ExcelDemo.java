package ReviewClass11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDemo {
    public static void main(String[] args) {

        String path="Files/Book1.xlsx";

        try {
            FileInputStream fis=new FileInputStream(path);

        } catch (FileNotFoundException e) {
            System.out.println("Please check the path of the file");
        }
    }
}
