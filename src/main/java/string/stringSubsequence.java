package string;

public class stringSubsequence {
    public static void main(String[] args) {

        String[] arr= {"A", "B", "C"};
        int n = arr.length;

        for (int i = 0; i < 1<< n; i++) {//until 2^3

            for (int j = 0; j < n; j++) {
                if((i & ( 1 << j) )!= 0){
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();




        }


    }
}
