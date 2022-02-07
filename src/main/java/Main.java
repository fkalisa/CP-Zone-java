
public class Main {
    public static void main(String[] args) {

        System.out.println(calculateResult("3*(9+1)*2", 0)[0]);

    }

    public static int[] calculateResult(String s, int i) {

        String MULTI = "*";
        String ADD = "+";

        int result = 0;
        String op = "";

        while (i < s.length()) {
            String current = String.valueOf(s.charAt(i));
            if (current.equals(")")) {
                return new int[]{result, i + 1};
            }
            int next_i = i + 1;

            if (current.equals(MULTI) || current.equals(ADD)) {
                op = current;
            } else {
                int num;
                if (current.equals("(")) {
                    int arr[] = calculateResult(s, i + 1);
                    num = arr[0];
                    next_i = arr[1];
                } else {
                    num = Integer.parseInt(current);
                }


                if (op.equals("")) {
                    result = num;
                } else {

                    result = op.equals(ADD) ? result + num : result * num;
                    op = "";

                }


            }
            i = next_i;
        }
        return new int[]{result, i+1};
    }
}
