import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<array.length; i++){
            if(array[i]>height){
                list.add(array[i]);
            }
        }
        answer=list.size();
        return answer;
    }
}