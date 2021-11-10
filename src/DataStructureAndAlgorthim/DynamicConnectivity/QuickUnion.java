package DataStructureAndAlgorthim.DynamicConnectivity;

public class QuickUnion {
    private int id[];

    public QuickUnion(int N) {
        id=new int[N];
        for (int i=0;i<N;i++){
            id[i]=i;
        }
    }

    private int root(int i){
        // i = node, id[i] = root of the node
        while (i!=id[i]){
            i=id[i];
        }
        return i;
    }

    // check if two node is connected or not
    public boolean isConnected(int p,int q){
        return root(p)==root(q);
    }

    // union operation of two nodes
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i==j)
            return;
        id[i]=j;
    }
}
