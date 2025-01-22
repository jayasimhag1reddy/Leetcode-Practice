class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    ans++;
                    helper(grid,i,j,m,n,vis);
                }
            }
        }
        return ans;
    }
    public void helper(char[][] grid,int i,int j,int m,int n,int[][] vis){
        if(i>=0 && i<m && j>=0 && j<n && vis[i][j]==0 && grid[i][j]=='1'){
            vis[i][j]=1;
            helper(grid,i+1,j,m,n,vis);
            helper(grid,i,j+1,m,n,vis);
            helper(grid,i-1,j,m,n,vis);
            helper(grid,i,j-1,m,n,vis);
        }

    }
}