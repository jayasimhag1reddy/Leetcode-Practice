class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        int[] indeg=new int[n];
        int c=0;
        for(int[] ar:pre){
            al.get(ar[0]).add(ar[1]);
            indeg[ar[1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==0){
                q.add(i);
                c++;
            }
        }
        while(!q.isEmpty()){
            int tmp=q.poll();
            for(int i:al.get(tmp)){
                --indeg[i];
                if(indeg[i]==0){
                    q.add(i);
                    c++;
                }
            }
        }
        return c==n;


    }
}





