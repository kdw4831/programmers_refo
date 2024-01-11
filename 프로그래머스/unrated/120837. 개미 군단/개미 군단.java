class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a=0;
        int b=0;
        int c=0;
        
        if(hp/5!=0){
            a=hp%5;
          answer+=hp/5;
        }
        
        if(a/3!=0){
            b=hp%3;
            answer+=hp/3+b;
        }
        
        
        
        
        

        return answer;
    }
}