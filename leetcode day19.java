class Solution {
    public int pivotIndex(int[] nums) {
      int n=nums.length;
      int suff[]=new int[n];
      int pref[]=new int[n];
      suff[0]=nums[0];
      pref[n-1]=nums[n-1];
      int k=0;
      for(int i=1;i<n;i++){
          k=n-i-1;
          suff[i]=suff[i-1]+nums[i];
          pref[k]=pref[k+1]+nums[k];
      }
      for(int x=0;x<n;x++){
          if(suff[x]==pref[x]){
              return x;
          }
      }
      return -1;
}
}