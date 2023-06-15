package concept;

public class MaxSubarraySumOfSizeK_2 {

    public static void main(String[] args) {
        int arr[]={ -2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("---1. max subarray of size k----");
        computeOfSizeK(arr);

        System.out.println("---2max subarray of size k, SLIDDING WINDOW----");
        compute4(arr);
    }

    private static void computeOfSizeK(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i =1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int maxi = Integer.MIN_VALUE;
        int k = 3;

        for (int i = 0; i <= n-k; i++) {
            int l = i;
            int r = i+k-1;
            int sum = prefix[r];
            if(l>0){
                sum = sum - prefix[l-1];
            }
            maxi = Math.max(maxi, sum);
        }
        System.out.println(maxi);

    }

    /*
        sliding window
     */

    private static void compute4(int[] arr) {
        int n = arr.length;
        int k = 3;
        int l= 0;

        int sum = 0;
        // pre computation
        for (int i = l; i <=k-1; i++) {
            sum = sum +  arr[i];
        }

        int maxi = sum;
        int r = k-1;
        while( r < n-1) {
            sum = sum -arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxi = Math.max(maxi, sum);
        }

        System.out.println(maxi);
    }
}
