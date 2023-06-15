package string;

public class stringComputeHash {
    public static void main(String[] args) {
        String s = "nemo";

        int n = s.length();

        long p = 1;
        long m = 100_000_007;
        long result = 0;

        System.out.println((int)"a".charAt(0));
        for(int i = 0; i < n; i++){
            result = (result+ (s.charAt(i)*p)%m)%m;
            p = p*31;
        }

        System.out.println(result);
    }
}
