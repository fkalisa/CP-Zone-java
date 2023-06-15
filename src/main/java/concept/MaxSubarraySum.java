package concept;

public class MaxSubarraySum {
    /*
    contiguous
    Subarray = Substring
     */
    public static void main(String[] args) {
        int arr[]={ -2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("---1. max subarray---");
        compute1(arr);
        System.out.println("---2 max subarray----");
        compute2(arr);

    }

    /*
    3 loops : N^3
     */
    private static void compute1(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <=j; k++) {
                    //System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                maxi = Math.max(maxi, sum);
                //System.out.println();
            }
        }
        System.out.println(maxi);
    }
    /*
    2 loops : N^2
     */
    private static void compute2(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
               // System.out.print(arr[j] + " ");
                sum = sum + arr[j];
                maxi = Math.max(maxi, sum);

            }

            //System.out.println();
        }
        System.out.println(maxi);
    }

    /*
        max sum of size k
     */



}
