import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int max_X=-256;
        int max_Y=-256;
        int min_X=256;
        int min_Y=256;
        
        for(int i=0; i<dots.length; i++){
            for(int j=0; j<2; j++){
                if(max_X<dots[i][0]){
                    max_X=dots[i][0];
                }
                if(max_Y<dots[i][1]){
                    max_Y=dots[i][1];
                }
                if(min_X>dots[i][0]){
                    min_X=dots[i][0];
                }
                if(min_Y>dots[i][1]){
                    min_Y=dots[i][1];
                }
            }
        }
        answer=(max_X-min_X)*(max_Y-min_Y);
        return answer;
    }
}