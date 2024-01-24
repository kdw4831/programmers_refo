import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        //1. 가장긴변이 sides안에 있는 경우
        //2. 가장긴변이 나머지 한 변인 경우
        Arrays.sort(sides);
        
        for(int i=1; i<=2000; i++){
            if(sides[1]<sides[0]+i && i<sides[1]+sides[0]){
                answer++;
            }
            
        }
        
        return answer;
    }
}