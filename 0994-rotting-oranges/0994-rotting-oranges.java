class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int ans=0;
        int[] dr=new int[]{-1,0,1,0};
        int[] dc=new int[]{0,1,0,-1};
        while(!q.isEmpty()){
            int si=q.size();
            while(si>0){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                for(int i=0;i<4;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];
                    while(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]=2;
                    }
                }
                si--;
            }
            ans++;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)return -1;
            }
        }
        return ans==0?0:ans-1;
    }
}

