package concept;

import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubarraySumEqualsK_4 {
   /*
   prefix
   map
    */

    public static void main(String[] args) {


    }

    public int maxSubArrayLen(int[] nums, int k) {

        int n = nums.length;
        int prefix [] = new int [n];

        prefix [0] = nums[0];

        int maxi = 0;

        for(int i = 1; i < n; i ++){
            prefix [i] = prefix[i-1] + nums[i];

        }

        // value, index
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            int current = prefix[i];

            if(current == k){
                maxi = Math.max(maxi, i +1);
            }else if(map.get(current-k )!= null){
                maxi = Math.max(maxi, i- map.get(current-k ));
            }

            if(map.get(current)== null){
                map.put(current, i);
            }
        }

        return maxi;

    }
}
