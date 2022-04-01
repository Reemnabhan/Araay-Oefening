package brussel.intec;

import java.util.Arrays;
import java.util.Random;

public class Oefining1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i]= rand.nextInt(150);

            System.out.println(  array[i]);
        }
        int small1=array[0];
        int small2=1000000;
        for (int i=0;i<array.length;i++){
            if(array[i]<small1){
                small2=small1;
                small1=array[i];

            }else if(array[i]< small2 && array[i]>small1){
                small2=array[i];

            }


        }
        System.out.println("smaal1"+" "+ small1);
        System.out.println("small2"+" " +small2 );


        {


        }

    }
}