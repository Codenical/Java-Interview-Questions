package LogicBuilding;

import java.util.Arrays;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 * Calculate the sum of the elements of the array
 */
public class _4_SumOfArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 10};
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            // sum = sum + arr[i];
            sum += arr[i];

        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum is: " + sum);

    }

}
