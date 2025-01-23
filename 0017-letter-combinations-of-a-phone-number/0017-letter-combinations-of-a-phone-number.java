class Solution {
    public List<String> letterCombinations(String digits) {
        String[] dig=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            ans=helper(dig[digits.charAt(i)-'0'],ans);
        }
        return ans;
    }
    public List<String> helper(String str,List<String> ans){
        List<String> al=new ArrayList<>();
        if(ans.size()==0){
            for(int i=0;i<str.length();i++){
                al.add(str.charAt(i)+"");
            }
        }
        else{
            for(int i=0;i<str.length();i++){
                for(String s:ans){
                    al.add(s+str.charAt(i));
                }
            }
        }
        return al;
    }
}