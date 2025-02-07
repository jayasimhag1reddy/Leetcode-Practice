class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int j=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                j=Math.max(j,hm.get(s.charAt(i))+1);
            }
            hm.put(s.charAt(i),i);
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}



    
    
