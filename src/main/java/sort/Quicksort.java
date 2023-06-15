package sort;

import java.util.*;

public class Quicksort {

    int a;
    int b;
    /*

    Average case : NLog(N)
    Worse case : N^2

    5 pointer,
    left = 0
    right = n-1
    pivot = right
    wall = left (also known as mid)
    i the iterator
     */
    public static void main(String[] args) {



        Deque<Integer> d;

        Map<Integer, Integer> map = new HashMap<>();

        Set<Map.Entry<Integer, Integer>> a = map.entrySet();

        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 2);
        map.put(1, 2);
        map.put(1, 2);
        map.put(1, 2);
        map.put(1, 2);
        map.put(1, 2);
        map.put(5, 2);

        synchronized(map){
            for(Integer key : map.keySet()){
                if(key >=2){
                    map.remove(key);
                }
            }
        }
    }

    public static void sort(int arr[], int left, int right){
        if (left >= right){
            return;
        }
        int pivot = right;
        int wall = left;

        for (int i = left; i <= right; i++) {
            if(arr[i] < arr[right]){
                //swap
                swap(arr, wall, i);
                wall++;
            }

        }

        // we reached the pivot
        swap(arr, wall, pivot);
        sort(arr, left, pivot-1);
        sort(arr, pivot+1, right);

    }
    public static void swap( int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quicksort quicksort = (Quicksort) o;
        return a == quicksort.a && b == quicksort.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
