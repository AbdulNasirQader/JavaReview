package ReviewClass2;

public class Casting {
    public static void main(String[] args) {


        /*
        Casting- convert 1 datatype into another
          1. widening/implicit/automatic
          (byte-> short->int->float->double)
          2. narrowing/explicit/automatic
          (double-> float-> long-> int-> short-> byte)
         */


        //widening
        double d=5;
        System.out.println(d);//5.0

        //narrowing
        int i=(int)5.0;
        System.out.println(i);//5

        int num=128;
        byte b=(byte)num;
        System.out.println(b);




    }
}
