
class Solution {
    public String reverseWords(String s) {
        String sa[]=s.trim().split("\\s+");
        StringBuffer rs=new StringBuffer();
        for(int i=sa.length-1;i>=0;i--){
            if(sa[i]!=" "){
                rs.append(sa[i]);
            }
            if(i!=0){
                rs.append(" ");
            }
        }
        return rs.toString();
    }
}