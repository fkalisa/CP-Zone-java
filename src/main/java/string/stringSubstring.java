package string;

public class stringSubstring {
    public static void main(String[] args) {

        String s ="123";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j <n ; j++) {
                sb.append(s.charAt(j));
                System.out.println(sb);
            }
        }
    }
}
