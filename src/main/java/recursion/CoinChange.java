package recursion;

public class CoinChange {

    /*
    https://leetcode.com/problems/coin-change/
     */
    public static void main(String[] args) {
        int amount = 11;
        int coins[] = {1, 2, 5};
        System.out.println(helper(coins, amount, 0));
        System.out.println(helper2(coins, amount));
    }



    private static int helper(int [] coins, int amount, int i){
        if (i == coins.length)
        {
            if (amount == 0)
            {
                return 0;
            }
            return 10001;
        }
        int left =10001;;

        if (amount >= coins[i])
        {
            left = 1 + helper(coins, amount- coins[i],  i  );
        }
        int right = helper(coins, amount,  i + 1 );

        return Math.min(left, right);

    }

    private static int helper2(int [] coins, int amount){
        if(amount ==0){
            return 0;
        }

        int mini = 10001;
        for(int k = 0; k < coins.length; k++){
            if(amount >= coins[k]){
                mini = Math.min(mini ,1+helper2( coins,  amount - coins[k]));
            }
        }
        return mini==10001? 0: mini;
    }
}
