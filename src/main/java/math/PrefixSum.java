package math;

public class PrefixSum {

    /*
    https://leetcode.com/problems/subarray-sum-equals-k/
     */

    public static void main(String[] args) {

        int [] arr = {2, 1,3, 3, 4};
        int n = arr.length;
        int prefix [] = new int[n];

        prefix[0] = arr[0];



        for(int i =1; i < n; i++){
            prefix[i] = prefix[i-1] +arr[i]  ;
        }

        int left = 2;
        int right =4;

        System.out.println(compute(arr, prefix, left, right));
        System.out.println(computeBruteForce(arr, left, right));
    }


    static int computeBruteForce(int arr[], int left, int right){
        int n = arr.length;
        int sum = 0;
        for (int i = left; i <=right ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static int compute(int arr[], int prefix [], int left, int right){
        int sum = 0;
        if(left == 0){
            sum = prefix[right];
        }else{
            sum=prefix[right] -prefix[left-1];
        }
        return sum;
    }
}
