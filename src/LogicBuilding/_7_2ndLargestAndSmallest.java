package LogicBuilding;

import java.util.Arrays;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 * Find the second smallest and second largest element in an array
 */
public class _7_2ndLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, -8, 12, 45, 90};
        int n = arr.length;

        Arrays.sort(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("2nd Smallest: " + arr[1]);
        System.out.println("2nd Largest: " + arr[n - 2]);

    }

}
