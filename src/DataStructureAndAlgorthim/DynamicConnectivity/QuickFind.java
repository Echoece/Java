package DataStructureAndAlgorthim.DynamicConnectivity;
// check the notes.txt for more details.
public class QuickFind {
    private int[] id;

    // constructor , initializing the array
    public QuickFind(int N){
        id= new int[N];
        for(int i=0;i<N;i++)
            id[i]=i;
    }

    // check if two node is connected or not
    public boolean isConnected(int p, int q){
        return id[p]==id[q];
    }

    // changes all the value in p and all other values same as p and replace them with
    // the value of q.
    public void union(int p, int q){
        int pId = id[p];
        int qId = id[q];
        for (int i=0;i<id.length;i++){
            if(id[i]==pId){
                id[i]=qId;
            }
        }
    }
}

