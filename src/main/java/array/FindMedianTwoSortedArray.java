package array;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindMedianTwoSortedArray {

    public static void main(String[] args) {
        // int arr1[]  = {1, 12, 13, 26, 38};
        // int arr2 [] = {2, 15, 17, 30, 45};

        // int arr1[]  = {1, 12, 13, 26, 38, 50, 77, 81};
        //  int arr2 [] = {2, 15, 16, 17, 20, 25, 30, 45};

        int arr1[]  = {15, 17, 19, 20};
        int arr2 [] = {22, 24, 26, 30};

        Map.Entry<Character, Integer> entry = new AbstractMap.SimpleEntry<>();


    }

    int compute (int arr1[], int arr2[]){

        int middle1;
        int middle2;


        int left1 = 0;
        int left2 = 0;

        int right1 = arr1.length-1;
        int right2 = arr2.length-1;

        while(left1 < right1 -1){
            middle1 = (int)Math.floor(right1+left1)/2;
            middle2 = (int)Math.floor(right2+left2)/2;
        }

        return 0;
    }

}
