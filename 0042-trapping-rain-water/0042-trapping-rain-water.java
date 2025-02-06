class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int l=0;
        int r=0;
        for(int i=0;i<n;i++){
            left[i]=l;
            right[n-i-1]=r;
            l=Math.max(l,height[i]);
            r=Math.max(r,height[n-i-1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.max(0,Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}
