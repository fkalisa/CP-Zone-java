package concept;

public class SubarrayPrint_1 {

    public static void main(String[] args) {
        int [] arr = {3, 4, 1, 2};
        compute1(arr);
        System.out.println("---");

    }

    static void compute1(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <=j  ; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
