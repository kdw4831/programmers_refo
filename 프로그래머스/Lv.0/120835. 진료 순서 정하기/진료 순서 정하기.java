import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] cemergency=Arrays.copyOf(emergency,emergency.length);
        Arrays.sort(emergency);
        int mapIndex=1;
        int arrIndex=0;
        HashMap<Integer,Integer> map =new HashMap<>();
       
        
        for(int i=emergency.length; i>=1; i--){
            map.put(emergency[i-1],mapIndex);
            mapIndex++;
            
        }
        
        for(int i=0; i<cemergency.length; i++){
            answer[i]=map.get(cemergency[i]);
        }
        
        return answer;
    }
}