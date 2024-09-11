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

        System.out.println("Old Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = 25;

//        System.out.println("\nNew Array:");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }


        System.out.println(Arrays.toString(newArr));

    }
}
