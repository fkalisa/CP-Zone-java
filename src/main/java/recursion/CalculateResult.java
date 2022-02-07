package recursion;

public class CalculateResult {
    public static void main(String[] args) {

        System.out.println(compute("3*(9+1)*2", 0)[0]);
    }

    public static int[] compute(String input, int i){

        final String ADD ="+";
        final String MULTI ="*";

        int result = 0;
        String op = "";

        while (i < input.length()){
            String tmp = String.valueOf(input.charAt(i));
            if(tmp.equals(")")){
                return new int[]{ result, i+1};
            }
            int next_i = i+1;
            if(tmp.equals(ADD) || tmp.equals(MULTI)){
                op= tmp;
            }else{
                int num;
                if (tmp.equals("(")){
                    int arr [] = compute(input, i+1);
                    num = arr [0];
                    next_i = arr[1];
                }else{
                    num = Integer.parseInt(tmp);
                }

                if (op.equals("")){
                    result = num;
                }else{
                    result = op.equals(MULTI)? result * num :result + num;
                    op ="";

                }

            }
            i = next_i;

        }

        return new int[]{ result, i+1};

    }
}
