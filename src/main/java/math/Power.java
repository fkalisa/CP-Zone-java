package math;

public class Power {
    public static void main(String[] args) {

        System.out.println(power(2, 3, 1_000_000_007));
    }


    static long power(int b, int p, int mod){

        if(p==0){
            return 1;
        }

        if(p%2 ==0){
            return  power(b*b, p/2, mod)%mod;
        }

        return b*power(b, p-1, mod)%mod;
    }


    static long powerInterative(int b, int p, int mod){

        return 0l;
    }
}
