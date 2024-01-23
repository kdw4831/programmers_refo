import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String arr[]= String.valueOf(num).split("");
        String K= Integer.toString(k);
        for(int i=0; i<arr.length; i++){
            if(K.equals(arr[i])){
                answer=i+1;
                break;
            }
            answer=-1;
        }
        return answer;
    }
}