package LogicBuilding;

import java.util.Arrays;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 * Reverse the given array, without using second array.
 */
public class _5_ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = {-1, 11, 10, 5, 9};
        int n = arr.length;
        System.out.println("Array: " + Arrays.toString(arr));

        int last = n - 1;
        int temp;

        for (int curr = 0; curr < n / 2; curr++) {
            temp = arr[curr];
            arr[curr] = arr[last];
            arr[last] = temp;
            last--;
        }

        System.out.println("RevArray: " + Arrays.toString(arr));

    }

}
