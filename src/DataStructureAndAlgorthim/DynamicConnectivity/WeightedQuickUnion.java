package DataStructureAndAlgorthim.DynamicConnectivity;

public class WeightedQuickUnion {
    private int[] id,sz;

    public WeightedQuickUnion(int N) {
        id=new int[N];
        sz=new int[N];  // array for measuring the tree weight,
        for (int i=0;i<N;i++){
            id[i]=i;
            sz[i]=1;
        }
    }

    private int root(int i){
        // i = node, id[i] = root of the node
        while (i!=id[i]){
            i=id[i];
        }
        return i;
    }

    public boolean connected(int p,int q){
        return root(p)==root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i==j)
            return;

        // this logic is the improvement from the quick union
        if(sz[i]<sz[j]){
            id[i]=j;
            sz[j]+=sz[i];   //updating the size of q tree, since we add the p tree as child
        }
        else {
            id[j]=i;
            sz[i]+=sz[j];
        }
    }
}
