package algorithm;

public class Tarjan {
    /*
    O(E+V)
    application :
        - critical connections
        - detect cycles

    for undirected and directed graph
    for directed graph, a loop on top of the recursion
    implementation :
        - 2 arrays(tag, low), the parent
        - update the low with the minimul low when returning back
        - if tag(current) < low(edge), add to the result

     */
    public static void main(String[] args) {

    }
}
