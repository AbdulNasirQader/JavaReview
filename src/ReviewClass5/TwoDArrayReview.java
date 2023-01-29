package ReviewClass5;

import java.sql.SQLOutput;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][] array={
                {1,2,3},//0
                {11,12,13},//1
                {20,21,22},//2
                {100,101}//3
        };
       /* int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsInArray=array[0].length;
        System.out.println(numberOfElementsInArray);

        int numberOfElementsIn1Array=array[3].length;
        System.out.println(numberOfElementsInArray);*/

        //getting all values from 2D array
       /* for(int[] arr:array){//iterates over arrays
            for(int num:arr){//iterates over each element
                if(num%2==0){
                    System.out.println(num+" ");
                }
            }
            System.out.println();

        }*/

        //getting all values from 2D array using regular for loop

        for (int row = 0; row < array.length; row++) {//outer loop iterates over rows

            for(int col=0; col<array[row].length; col++){//iterates over each column

                // I want to print values only from odd rows

                if(row%2!=0){
                    System.out.println(array[row][col]);
                }
            }
            System.out.println();
        }

    }
}
