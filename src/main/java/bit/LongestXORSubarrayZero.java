package bit;

import java.util.HashMap;

public class LongestSubarrayWithXorEqualToZero {
    /*
        x ^ 0 = X
     */
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 1, 2, 3, 3, 3, 3};
        System.out.println(compute(arr));
    }

    private static int compute(int[] arr) {
        int n = arr.length;
        int result = 0;
        // in map, xor, index
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total ^ arr[i];
            if (map.containsKey(total)){
                result = Math.max(result, i- map.get(total) );
            }else {
                // if xor is zero, we do not put it in the map
                if (total != 0){
                    map.put(total, i);
                }
            }
        }
        return result;
    }
}
