package dp;

public class Knapsack {

    public static void main(String[] args) {
        int values [] ={30, 50, 60};
        int weights[] = {3, 4, 5};

        int bagWeight = 8;
        int n = weights.length;

        System.out.println(compute1(values, weights, bagWeight, n-1));;
    }

    /*
        0/1 Knapsack
     */
    private static int compute1(int[] values, int[] weights, int bagWeight, int i) {
        if(i == 0){
            if (bagWeight <= weights[0]) {
                return values[0];
            }
            return 0;
        }
        int take = Integer.MIN_VALUE;
        if(weights[i] <= bagWeight ){
            //stealing, the bag weight changes
             take =values[i] + compute1(values, weights, bagWeight-weights[i], i-1 );
        }
        // not stealing anything, the bag weight stays the same
        int notTake = compute1(values, weights, bagWeight, i-1 );

       return Math.max(take, notTake);
    }

    private static int compute2(int[] values, int[] weights, int bagWeight, int i) {

        return 0;

    }
}
