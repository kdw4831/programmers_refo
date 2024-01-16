class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int add_k=0;
        
        if(n>=10){
            add_k=n/10;
        }
        
        answer=n*12000+(k-add_k)*2000;
        return answer;
    }
}