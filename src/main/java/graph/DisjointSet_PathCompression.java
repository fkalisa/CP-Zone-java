package graph;

public class DisjointSet_PathCompression {
    int arr[];
    int rank [];

    /*
      N is the number of vertices in the graph.
      \alphaα refers to the Inverse Ackermann function.
      In practice, we assume it's a constant. In other words,
       O(\alpha (N))O(α(N)) is regarded as O(1)O(1) on average.
     */

    // O(N) time for the constructor
    public DisjointSet_PathCompression(int n){
        arr = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =i;
            rank[i] =1;
        }
    }

    public static void main(String[] args) {


    }

    boolean union(int a, int b){

        int parentA = find(a);
        int parentB = find(b);

        if (parentA == parentB){
            //cycle detection
            return false;
        }
            if (rank[parentA] > rank[parentB]){
                arr[parentB] = parentA; // parents
            }else if(rank[parentA] <rank[parentB]){
                arr[parentA] = parentB; // parents
            }else{
                arr[parentB] = parentA; // parents
                rank[parentA]++;
            }


        return true;
    }



    int find(int a){
        if(a == arr[a]){
            return a;
        }
        return arr[a] = find(arr[a]);
    }


    boolean connected(int a, int b){
       return find(a) == find(b);
    }

    // connected component
    public int getSetsCount() {
        int rv = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) rv++;
        }
        return rv;
    }

    public int [] getParent(){
        return arr;
    }
}
