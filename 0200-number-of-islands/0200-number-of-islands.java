class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        // int[][] vis=new int[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    helper(grid,i,j,m,n);
                }
            }
        }
        return ans;
    }
    public void helper(char[][] grid,int i,int j,int m,int n){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]=='1'){
            grid[i][j]='0';
            helper(grid,i+1,j,m,n);
            helper(grid,i,j+1,m,n);
            helper(grid,i-1,j,m,n);
            helper(grid,i,j-1,m,n);
        }

    }
}