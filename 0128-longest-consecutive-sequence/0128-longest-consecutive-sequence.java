class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> hs=new HashSet<>();
        for(int i:nums)hs.add(i);
        int ans=0;
        for(int i:nums){
            if(!hs.contains(i-1)){
                int c=0;
                while(hs.contains(i)){
                    c++;
                    i++;
                }
                ans=Math.max(c,ans);
            }
        }
        return ans;
    }    
    
}


