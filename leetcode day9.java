class Solution {
    public int compress(char[] chars) {
      int index=0;
      int Aindex=0;  
      while(index<chars.length){
          char current=chars[index];
          int count=0;
          while(index<chars.length&&chars[index]==current){
              index++;
              count++;
          }
          chars[Aindex++]=current;
          if(count!=1)
                for(char c:Integer.toString(count).toCharArray())
                    chars[Aindex++]=c;
      }
      return Aindex;
    }
}