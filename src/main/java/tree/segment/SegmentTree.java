package tree.segment;

import java.util.Arrays;

public class SegmentTree {

    static int arr[] = {2, 3, 4, 7};
    static int seg[] = new int[4*arr.length];

    public static void main(String[] args) {
        buid(0, 0, arr.length-1);
        System.out.println(Arrays.toString(seg));
    }

    static void buid(int ind, int low, int high){
        if (low == high){
            seg[ind]= arr[low];
            return;
        }

        int mid = (low+high)/2;
        buid(2* ind+1,  low,  mid);
        buid(2* ind+2,  mid+1,  high);
        seg[ind] = Math.min( seg[2* ind+1], seg[2* ind+2]);
    }


    int query(int ind, int low, int high, int l, int h){
        //3 out, a big value
        //low high l h, l h low high
        if(l> high  ||  low > h){
            return Integer.MAX_VALUE;
        }

        //2 in range
        // l low high h
        if(low >= l && h >=high ){
            return seg[ind];
        }

        //1 partially

        int mid = (low+high)/2;

        int left = query( 2*ind+1,  low,  mid,  l,  h);
        int right = query( 2*ind+2,  mid+1,  high,  l,  h);


        return Math.min(left, right);
    }

    void update(int ind, int low, int high, int i, int val){

        if (low==high){
            arr[i] = val;
            arr[ind] = val;
            return;
        }
        int mid = (low+high)/2;
        if(i <= mid){
            update(2* ind+1,  low,  mid,  i,  val);
        }else{
            update(2* ind+2,  mid+1,  high,  i,  val);
        }

        seg[ind] = Math.min(seg[2*ind+1], seg[2*ind+2]);

    }
}
