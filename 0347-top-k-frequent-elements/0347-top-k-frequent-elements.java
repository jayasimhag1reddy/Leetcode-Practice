class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> hm=new HashMap<>();
    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
       for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
       }
       for(int i:hm.keySet())pq.add(i);
       int[] ans=new int[k];
       int i=0;
       while(k>0){
        ans[i++]=pq.poll();
        k--;
       }
       return ans;
    }
}




