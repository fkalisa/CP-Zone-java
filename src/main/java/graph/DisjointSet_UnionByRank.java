package graph;

public class DisjointSet_UnionByRank {
    int arr[];
    int rank [];

    /*
     time O(N), for the constructor
     */
    public DisjointSet_UnionByRank(int n){
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =i;
            rank[i] =1;
        }
    }

    public static void main(String[] args) {


    }

    /*
     time O(log(N))
     */

    void union(int a, int b){

        int parentA = find(a);
        int parentB = find(b);

        if(parentA!= parentB){
            if (rank[parentA] > rank[parentB]){
                arr[parentB] = parentA; // parents
            }else if(rank[parentA] <rank[parentB]){
                arr[parentA] = parentB; // parents
            }else{
                arr[parentB] = parentA; // parents
                rank[parentA]++;
            }

        }

    }

    /*
     time O(log(N))
     */

    int find(int a){
        while (a!= arr[a]){
            a = arr[a];
        }
        return a;
    }

    /*
     time O(log(N))
     */
    boolean connected(int a, int b){
       return find(a) == find(b);
    }
}
