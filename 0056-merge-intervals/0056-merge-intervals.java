class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,((a,b)->a[0]-b[0]));
        List<List<Integer>> al=new ArrayList<>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(e>=intervals[i][0]){
                e=Math.max(e,intervals[i][1]);
            }
            else{
                al.add(new ArrayList<>(Arrays.asList(s,e)));
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        al.add(new ArrayList<>(Arrays.asList(s,e)));
        int[][] ans=new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            ans[i][0]=al.get(i).get(0);
            ans[i][1]=al.get(i).get(1);
        }
        return ans;
    }
}


// [[1,3],[2,6],[8,10],[15,18]]


// [[1,6],[8,10],[15,18]]

