import java.util.*;
class Solution {
    public String solution(String my_string) {

        String answer = "";
        String[] my_string_arr=my_string.split("");
        
        for(String tmp : my_string_arr){
            char ch=tmp.charAt(0);
            if(Character.isUpperCase(ch)){
                
                answer+=tmp.toLowerCase();
            }else{
                
                answer+=tmp.toUpperCase();
            }
        }
        
        return answer;
    }
}