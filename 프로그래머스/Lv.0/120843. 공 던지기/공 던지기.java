class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx=0;
        for(int i=0; i<k; i++){
            if(numbers.length-1>=idx){
                answer=numbers[idx];
                idx+=2;
            }else{
                answer=numbers[idx%numbers.length];
                idx+=2;
            }
            
        }
        
        return answer;
    }
}