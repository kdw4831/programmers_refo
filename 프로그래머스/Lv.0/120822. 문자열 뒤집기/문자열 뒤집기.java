//import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        int startCount=0;
        char[] chararr=my_string.toCharArray();
        char[] reverse_arr=new char[my_string.length()];
        
        
        for(int i=chararr.length-1; i>=0; i--){
            reverse_arr[startCount]=chararr[i];
            startCount++;
        }
        
        answer=new String(reverse_arr);
        return answer;
    }
}