import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        int[] org_arr=Arrays.copyOf(array,array.length);
        Arrays.sort(array);
        answer[0]=array[array.length-1];
        for(int i=0; i<array.length; i++){
            if(org_arr[i]==array[array.length-1]){
                answer[1]=i;
            }
        }
        return answer;
    }
}