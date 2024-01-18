import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr=my_string.split("");
        List<String> list= new ArrayList<>();
        for(String tmp : arr){
            if(!list.contains(tmp)){
                list.add(tmp);
                answer+=tmp;
            }
        }
        return answer;
    }
}