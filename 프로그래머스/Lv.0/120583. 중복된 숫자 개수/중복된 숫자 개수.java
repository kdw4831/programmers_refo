class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int tmp :array){
            if(tmp==n){
                answer++;
            }
        }
        return answer;
    }
}