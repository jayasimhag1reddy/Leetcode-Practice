class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    vis[i][j]=1;
                }
            }
        }
        int c=0;
        int[] rd=new int[]{-1,0,1,0};
        int[] cd=new int[]{0,-1,0,1};
        while(!q.isEmpty()){
            int si=q.size();
            c++;
            while(si>0){
                int[] tmp=q.poll();
                for(int i=0;i<4;i++){
                    int nr=rd[i]+tmp[0];
                    int nc=cd[i]+tmp[1];
                    if(nr>=0 && nc>=0 && nr<m && nc<n && vis[nr][nc]==0 && grid[nr][nc]==1){
                        vis[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
                si--;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && vis[i][j]==0){
                    return -1;
                }
            }
        }
        return c==0 ? 0 : c-1;
    }
}