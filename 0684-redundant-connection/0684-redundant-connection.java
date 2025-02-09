class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] par=new int[n+1];
        int[] size=new int[n+1];
        for(int i=1;i<=n;i++){
            par[i]=i;
            size[i]=1;
        }
        int[] ans=new int[2];
        for(int[] ar:edges){
            int p1=findPar(ar[0],par);
            int p2=findPar(ar[1],par);
            if(p1!=p2){
                if(size[p1]>size[p2]){
                    size[p1]+=size[p2];
                    par[p2]=p1;
                }
                else{
                   size[p2]+=size[p1];
                    par[p1]=p2;
                }
            }
            else{
                ans=ar;
            }
        }
        return ans;
    }
    public int findPar(int i,int[] par){
        if(par[i]==i)return i;
        int p=findPar(par[i],par);
        return par[i]=p;
    }
}