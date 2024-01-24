import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 소문자로 바꾸는 메서드 toLowerCase
        my_string=my_string.toLowerCase();
        String[] arr=my_string.split("");
        Arrays.sort(arr);
        for(String tmp:arr){
            answer+=tmp;
        }
        return answer;
    }
}