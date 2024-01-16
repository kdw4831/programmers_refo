class Solution {
    public int[] solution(int[] num_list) {
        int evenCount=0;// 짝수 갯수
        int oddCount=0; //홀수 갯수
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        
        
        int[] answer = {evenCount,oddCount};
        return answer;
    }
}