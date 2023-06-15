package algorithm;

public class Kadane {
    /*

    a/
        maximum subarray sum
        subarray - concept
        sum negative, reset it

     b/


     */
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(compute_max(arr));
        System.out.println(compute_min(arr));

    }

    /*
        maximum sum subarray
     */

    public static int compute_max(int arr[]) {
        int maxi = 0;
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0){
                sum =0;
            }
        }
        return maxi;
    }
    /*
        minimum sum subarray
     */

    public static int compute_min(int arr[]) {
        int mini = 0;
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            mini = Math.min(mini, sum);
            if(sum >= 0){
                sum =0;
            }
        }
        return mini;
    }
}
