class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(factorial(i)==n){
                answer=i;
                break;
            }else if(factorial(i)>n){
                answer=i-1;
                break;
            }
        }
        
        return answer;
    }
    
    public int factorial(int n){
        if(n > 1){
            return n*factorial(n-1);    
        } 
        return n;
    }
}