import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
     
        int removeIndex=my_string.indexOf(letter);
        String tmp=null;
        StringBuilder sb=new StringBuilder(my_string);
        while(removeIndex != -1){
            tmp=sb.deleteCharAt(removeIndex).toString();
            removeIndex=tmp.indexOf(letter);
        }
        String answer=sb.toString();
        
        return answer;
    }
}