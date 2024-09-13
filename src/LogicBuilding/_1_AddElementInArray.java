package LogicBuilding;

import java.util.Arrays;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement : Add an element in an array
 */
public class _1_AddElementInArray {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};
        int n = arr.length;

        System.out.println("Array: " + Arrays.toString(arr));

        int[] newArr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = 25;
        System.out.println("New Array: " + Arrays.toString(newArr));


    }
}
