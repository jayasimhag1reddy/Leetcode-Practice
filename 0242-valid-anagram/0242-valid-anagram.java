class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sc=new int[26];
        int[] tc=new int[26];
        if(s.length() != t.length())return false;
        for(int i=0;i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            tc[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(sc[i]!=tc[i])return false;
        }
        return true;
    }
}