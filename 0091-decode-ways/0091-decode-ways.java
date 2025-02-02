class Solution {
    public int numDecodings(String s) {
        return helper(0,s);
    }
    public int helper(int i,String s){
        if(i>=s.length())return 1;
        if(s.charAt(i)=='0')return 0;
        int one=helper(i+1,s);
        int two=0;
        if(i+2<=s.length() && Integer.parseInt(s.substring(i,i+2))<=26){
            two=helper(i+2,s);
        }
        return one+two;
        

        

    }
}