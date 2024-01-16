class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int tmp : box){
            answer*=tmp/n;
        }
        
        return answer;
    }
}