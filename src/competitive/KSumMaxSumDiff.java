package competitive;

import javafx.collections.transformation.SortedList;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class KSumMaxSumDiff {

    public static void main(String[] args) {

//        int[] arr = new int[] {9, 1, 6, 1};
        int[] arr = new int[] {3, 2, 5, 6, 2, 6};
        int l = arr.length;

//        int[][] k = new int[][] {
//                {1, 1},
//                {1, 2},
//                {1, 3}
//        };
        int[][] k = new int[][] {
                {1, 2},
                {1, 5},
                {2, 6},
                {6, 6},
                {5, 5},
                {5, 5},
                {3, 5}
        };

        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] a: k) {
            for (int i = a[0] - 1; i < a[1]; i++) {
                sum += arr[i];

                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }

        // Sort map by value.
        List<Integer> list = map.entrySet().stream().map(e -> {
            return e.getValue();
        }).collect(Collectors.toList());
        Collections.sort(list);

        int maxSum = 0;
        Arrays.sort(arr);

        int j = list.size();
        for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
            int x = itr.next();
            maxSum += x * arr[l - j];
            j--;
        }

        System.out.println(maxSum - sum);
    }
}
