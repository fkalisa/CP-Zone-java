package concept;

public class MaxPeekInSubarray_3 {

    /*
        a[i-1] < a[i] > a[i+1]
        the solution is the array starting at index 1
        using sliding window
        before moving, r , i need to check if it is a peek, why before r was a corner element
        move l, now is corner element, check if i do not need to decrease peek
     */

    public static void main(String[] args) {

        int arr[] ={1, 2, 4, 1, 2, 4, 1, 2};
        int k = 6;
        int n = arr.length;
        compute(arr, k);
    }

    static void compute(int arr[],int k ){
        int n = arr.length;
        int l =0;
        int r = k-1;


        int peek = 0;


        for (int i = l+1; i <= r-1 ; i++) {
            if(arr[i-1]< arr[i] && arr[i] > arr[i+1]){
                peek++;
            }
        }
        int maxiPeek =peek;
        int idx = 0;

        System.out.println("peek : " +peek);

        while (r < n) {
            if (arr[r-1] < arr[r]  && r+1 < n && arr[r]>  arr[r+1]){
                peek++;
            }
            r++;

            l++;
            if (arr[l-1] < arr[l] &&  arr[l]>  arr[l+1]){
                peek--;
            }

            maxiPeek = Math.max(peek, maxiPeek);
            idx = l;

        }
    }
}
