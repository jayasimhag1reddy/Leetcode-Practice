class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al=new ArrayList<>();
        int rl=0,cl=0;
        int ru=matrix.length-1;
        int cu=matrix[0].length-1;
        boolean[][] vis=new boolean[ru+1][cu+1];
        while(rl<=ru && cl<=cu){
            for(int c=cl;c<=cu;c++){
                if(!vis[rl][c]){
                    al.add(matrix[rl][c]);
                    vis[rl][c]=true;
                }    
            }
            rl++;
            for(int r=rl;r<=ru;r++){
                if(!vis[r][cu]){
                    al.add(matrix[r][cu]);
                    vis[r][cu]=true;
                }   
            }
            cu--;
            for(int c=cu;c>=cl;c--){
                if(!vis[ru][c]){
                    al.add(matrix[ru][c]);
                    vis[ru][c]=true;
                }    
            }
            ru--;
            for(int r=ru;r>=rl;r--){
                if(!vis[r][cl]){
                    al.add(matrix[r][cl]);
                    vis[r][cl]=true;
                }    
            }
            cl++;
        }
        return al;
    }
}