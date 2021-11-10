package DataStructureAndAlgorthim.DynamicConnectivity;
// this algorithm in practice very close to linear time algorithm, and it should be used
// for dynamic connectivity.
public class WeightedQuickUnionWithPathCompression {
    private int[] id,sz;

    public WeightedQuickUnionWithPathCompression(int N) {
        id=new int[N];
        sz=new int[N];  // array for measuring the tree weight
        for (int i=0;i<N;i++){
            id[i]=i;
            sz[i]=1;
        }
    }

    private int root(int i){
        // i = node, id[i] = root of the node
        while (i!=id[i]){
            id[i]=id[id[i]];    // improvement from the Weighted QU
            i=id[i];
        }
        return i;
    }

    public boolean connected(int p,int q){
        return root(p)==root(q);
    }

    public void union(int p, int q){
        int rootOfP = root(p);
        int rootOfQ = root(q);

        // if both have same root
        if( rootOfP == rootOfQ )
            return;

        if( sz[rootOfP]<sz[rootOfQ] ){
            id[rootOfP]= rootOfQ;
            sz[rootOfQ]+=sz[rootOfP];   //updating the size of q tree, since we add the p tree as child
        }
        else {
            id[rootOfQ]= rootOfP;
            sz[rootOfP]+=sz[rootOfQ];   //updating the size of p tree, since we add the q tree as child
        }
    }
}
