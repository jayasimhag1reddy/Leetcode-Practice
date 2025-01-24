class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        int[] deg=new int[n];
        for(int[] ar:pre){
            deg[ar[1]]++;
            al.get(ar[0]).add(ar[1]);
        }
        Queue<Integer> q=new LinkedList<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(deg[i]==0){
                q.add(i);
                cnt++;
            }
        }
        while(!q.isEmpty()){
            int nod=q.poll();
            for(int i:al.get(nod)){
                --deg[i];
                if(deg[i]==0){
                    q.add(i);
                    cnt++;
                }
            }
        }
        return cnt==n;
    }
}


    