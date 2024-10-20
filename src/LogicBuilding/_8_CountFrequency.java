package LogicBuilding;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ChandanKrv on 18 October, 2024.
 * --------------------------------------------
 * Q. Problem Statement : Count the frequency of each element of an Array
 */
public class _8_CountFrequency {

    public static void firstMethod(int arr[], int n) {
        //Time Complexity: N^2
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Element: " + arr[i] + " Freq: " + count);
        }
    }

    public static void secondMethod(int arr[], int n) {
        //Time Complexity: N
        Map<Integer, Integer> freqHash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (freqHash.containsKey(arr[i])) {
                int value = freqHash.get(arr[i]);
                freqHash.put(arr[i], value + 1);
            } else {
                freqHash.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freqHash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 6, 6, 5, 6};
        int n = arr.length;

        //firstMethod(arr, n);
        secondMethod(arr, n);

    }
}
