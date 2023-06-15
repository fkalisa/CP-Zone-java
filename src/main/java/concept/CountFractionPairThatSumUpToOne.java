package concept;

import java.util.HashMap;
import java.util.Map;

public class CountFractionPairThatSumUpToOne {

    /*
    count fraction pair that sum up to 1
     */

    public static void main(String[] args) {

        int a [] = {1, 1, 3, 1,  1};
        int b [] = {2, 2, 4, 2, 2};



        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            String key = a[i]+"_"+b[i];
            map.put(key, map.getOrDefault(key, 0)+1 );

        }

        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            String key = a[i]+"_"+b[i];
            map.put(key, map.get(key)-1);

            int numerator = b[i] - a[i];
            int denominator = b[i];

            String new_key = numerator+"_"+denominator;
            answer = answer + map.getOrDefault(new_key, 0);

            map.put(key, map.get(key)+1);
        }

        System.out.println(answer);

    }
}
