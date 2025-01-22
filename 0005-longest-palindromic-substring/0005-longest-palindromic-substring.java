class Solution {
    public String longestPalindrome(String s) {
       String ans="";
       for(int i=0;i<s.length();i++){
           String p1=helper(s,i,i+1);
           String p2=helper(s,i,i);
           if(p1.length()>ans.length()){
                ans=p1;
           }
           if(p2.length()>ans.length()){
                ans=p2;
           }
       }
       return ans;
    }
    public String helper(String s,int i,int j){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            else{
                break;
            }
        }
        return s.substring(i+1,j);
    }
}