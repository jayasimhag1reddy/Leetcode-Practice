class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
           // min=Math.min(piles[i],min);
            max=Math.max(piles[i],max);
        }
        while(min<max){
            int mid=min+(max-min)/2;
            int c=0;
            for(int i:piles){
                c+=(i/mid);
                if(i%mid!=0){
                    c+=1;
                }
            }
            //System.out.println(c);
            if(c>h){
                min=mid+1;
            }
            else{
                max=mid;
            }
        }
        return max;
    }
}