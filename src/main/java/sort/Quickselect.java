package sort;

import java.util.Arrays;

public class Quickselect {

    public static void main(String[] args) {


        int arr[] ={3,2,1,5,6,4};
        int n = arr.length;
        int k = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr, 0, n-1, n-k));
    }

    public static int sort(int arr[], int left, int right, int index){
        if (left == right){
            return arr[left];
        }
        int pivot = right;
        int wall = left;

        for (int i = left; i <= right; i++) {
            if(arr[i] < arr[pivot]){
                //swap
                swap(arr, wall, i);
                wall++;
            }

        }

        // we reached the pivot
        swap(arr, wall, pivot);
        if (index == pivot){
            return arr[index];
        }else if(index > pivot){
            return sort(arr, pivot+1, right, index);

        }else{
           return sort(arr, left, pivot-1, index);
        }

    }
    public static void swap( int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
