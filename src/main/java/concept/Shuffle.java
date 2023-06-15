package concept;

import java.util.*;

/*
    new array
    set, to avoid collusion
 */
public class Shuffle {
    public static void main(String[] args) {

        int arr[] ={3, 1, 2};
        int res [] = new int[arr.length];

        System.out.println("Before : " + Arrays.toString(arr));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            res[i] = getRandom(set, arr);
            System.out.println(set);
        }
        System.out.println("After : " + Arrays.toString(res));
    }

    public static int getRandom( Set<Integer> set,  int arr[]){
        int idx = new Random().nextInt(arr.length);
        if (set.contains(idx)){
            return getRandom(set, arr);
        }
        set.add(idx);
        return arr[idx];
    }
}
