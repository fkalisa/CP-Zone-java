package sort;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {

        int arr[] ={1, 2, 3, 4, 1, 2, 3, 3, 3, 3};
        compute(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void compute( int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void swap( int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
