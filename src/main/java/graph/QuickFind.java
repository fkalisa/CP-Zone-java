package graph;

public class QuickFind {


    public static void main(String[] args) {

    }

    /*
    we store the root node in the array, so find O(1)
     */
    int [] root;

    public QuickFind(int n){
        root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i]= i;
        }
    }
    /*
    O(N)
     */
    void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if(rootA != rootB){
            for (int i = 0; i < root.length; i++) {
                if (root[i] ==rootB){
                    root[i]=  rootA;
                }
            }
        }
    }
/*
    time O(1)
 */
    int find(int a){
        return root[a];
    }
}
