class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=String.valueOf(ch);
            if(!hm.containsKey(st)){
                hm.put(st,new ArrayList<>());
            }
            hm.get(st).add(s);
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> al:hm.values()){
            ans.add(al);
        }
        return ans;
    }
}