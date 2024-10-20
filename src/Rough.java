import java.util.HashMap;

/**
 * Created by ChandanKrv on 06 October, 2024.
 * --------------------------------------------
 * Q. Problem Statement :
 */
public class Rough {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currEle = arr[i];
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (currEle == arr[j])
                    count++;
            }
            freq.put(currEle, count);
        }

        System.out.println(freq);
    }
}
