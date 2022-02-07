package algorithm;

public class Kadane {
    /*
        subarray - concept
        sum negative, reset it
     */
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(compute(arr));
    }

    public static int compute(int arr[]) {
        int result = 0;
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if(sum < 0){
                sum =0;
            }
            result = Math.max(result, sum);
        }

        return result;
    }
}
