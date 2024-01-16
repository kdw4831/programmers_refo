class Solution {
    public int solution(int n) {
        //피자는 최소 한판
        //나머지가 0일 땐 몫의 수
        //나머지가 0이 아닐 땐 몫+1
        int answer = 0;
        if(n%7==0){
            answer=n/7;
        }else{
            answer=n/7+1;
        }
        
        
        return answer;
    }
}