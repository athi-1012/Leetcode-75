class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n=ast.length;
        Stack<Integer> as=new Stack<>();
        for(int val:ast){
            if(val>0||as.isEmpty()){
                as.push(val);
            }
            else{
            while(true){
            int peek=as.peek();
            
            if(peek<0){
                as.push(val);
                 break;
            }
            else if(peek>-val){
                 break;
                
            }
            else if(peek==-val){
                as.pop();
                break;  
            }
             else{
                 as.pop();
                if(as.isEmpty()){
                    as.push(val);
                    break;
                }
             }
            
            }
            }
        }
        int i=as.size();
        int ans[] = new int[i];
        while(!as.isEmpty()) {
            if(i > 0)
                ans[i-1] = as.pop();
                i--;
        }
        return ans;
    }
}