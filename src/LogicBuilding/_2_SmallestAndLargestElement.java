package LogicBuilding;

import java.util.Arrays;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 * Find the smallest and largest number in an array
 */
public class _2_SmallestAndLargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 11, -7, 12, 9};
        int n = arr.length;
        System.out.println("Array: " + Arrays.toString(arr));

        //Smallest Element
        int smallest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("Smallest: " + smallest);

        //Largest Element
        int lrg = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > lrg)
                lrg = arr[i];
        }
        System.out.println("Largest: " + lrg);

    }
}
