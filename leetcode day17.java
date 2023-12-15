class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
           sum=sum+gain[i];
           max=Math.max(sum,max);
           
        }
        return max;
    }
}