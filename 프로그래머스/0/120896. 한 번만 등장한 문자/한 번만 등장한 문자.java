import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr= s.split("");
        for(int i=0; i<arr.length; i++){
            for( int j=i+1; j<arr.length; j++){
                if(arr[j].equals(arr[i])){
                   s=s.replaceAll(arr[j],""); 
                }
                   
            }
            
        }
        arr=s.split("");
        Arrays.sort(arr);
        
        for(String tmp:arr){
            answer+=tmp;
        }
        
        
        return answer;
    }
}