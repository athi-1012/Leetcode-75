class Solution {
    public int longestOnes(int[] nums, int k) {
      int count=0,n=nums.length,right=0,left=0,ans=0;
      while(right<n){
          if(nums[right]==0){
              count++;
          }
          while(count>k){
              if(nums[left]==0){
                  count--;
              }
              left++;
          }
          ans=Math.max(ans,right-left+1);
          right++;
      } 
      return ans;
    }
}