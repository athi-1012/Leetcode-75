class Solution {
    static int compare(int[][] grid,int[] ar,int n){
        int k=0;
        int ans=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ar[k++]!=grid[j][i]){
                    flag= false;
                    break;
                }
            }
            if(flag) ans++;
            else flag=true;
            k=0;   
            }
        
        return ans;
    }
    public int equalPairs(int[][] grid) {
        int n= grid.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int[] row=grid[i];
            ans+=compare(grid,row,n);
          
        }
        return ans;
}
}