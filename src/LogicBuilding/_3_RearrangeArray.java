package LogicBuilding;

import java.util.Arrays;

/**
 * Created by ChandanKrv on 12 September, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 * Rearrange the array in increasing-decreasing order
 * INPUT: 4 1 5 6 3 2 7
 * OUTPUT: 1 2 3 7 6 5 4
 * Explanation: First 3 elements are in the ascending
 * and next 3 elements are in the descending order.
 */
public class _3_RearrangeArray {
    public static void main(String[] args) {

        int[] arr = {4, 1, 5, 6, 3, 2, 7};
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
