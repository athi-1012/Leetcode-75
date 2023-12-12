class Solution {
    public int maxVowels(String s, int k) {
       int max=-999, c=0,p=0;
        int [] arr =new int[123];
        arr['a']=1;
        arr['e']=1;
        arr['u']=1;
        arr['i']=1;
        arr['o']=1;
        for(int i=0;i<s.length();i++){
           if(i<k){
               c+=arr[s.charAt(i)];
           }
           else{
                   c+=arr[s.charAt(i)];
               c-=arr[s.charAt(i-k)];
           }
            if(c>max){
                   max=c;
               }
        }
        return max;
    }
}