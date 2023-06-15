package math;

public class SquareRoot {

    /*
    binary search
    O(log(N))
     */
    public static void main(String[] args) {

        int n = 46;

        int left = 0;
        int right = n;

        int result = -1;
        while (left<=right){
            int mid = (left+ right)>>1;

            if(mid*mid <= n){
                result= mid;
                left = mid+1;
            }else{
                right= mid-1;
            }
        }

        System.out.println("Result : " + result);

    }
}
