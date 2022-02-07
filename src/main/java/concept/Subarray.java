package concept;

public class Subarray {
    /*
    contiguous
     */
    public static void main(String[] args) {
        int arr[]={ 2, 1, 5, 8};
        compute1(arr);
        System.out.println("---");
        compute2(arr);
    }

    /*
    3 loops : N^3
     */
    private static void compute1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    /*
    2 loops : N^2
     */
    private static void compute2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    /*
        recursion
     */

    private static void compute3(int[] arr) {
    }

}
