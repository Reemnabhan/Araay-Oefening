package brussel.intec;

import java.util.Arrays;
import java.util.Random;

public class Oefenig4 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 34, 56, 67, 10, 56, 3};
        System.out.println("Duplicate elements are ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);

            }

        }

    }
}
