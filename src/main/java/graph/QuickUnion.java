package graph;

public class QuickUnion {

    public static void main(String[] args) {


    }
    /*
      we store the parent node in the array, so union O(1)
       */

    int arr[];
    public QuickUnion(int n){
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
    }

    /*
    O(N)
     */

    void union(int a, int b){
       int parentA = find(a);
       int parentB = find(a);

       if(parentA != parentB){
            arr[parentB] = parentA;
        }
    }

    /*
    O(N), only in the worse case
    Otherwise it is < O(N)
    worse case means in linkedlist
     */

    int find(int a){
        while(a != arr[a]){
            a = arr[a];
        }
        return a;
    }


    boolean connected(int a, int b){
        return find(a) == find(b);
    }
}
