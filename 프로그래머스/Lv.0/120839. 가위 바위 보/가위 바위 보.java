class Solution {
    public String solution(String rsp) {
        // 이기는 경우
        // 2 => 0
        // 0 => 5
        // 5 => 2
        String answer = "";
        
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i)=='2'){
                answer+="0";
            }else if(rsp.charAt(i)=='0'){
                answer+="5";
            }else if(rsp.charAt(i)=='5'){
                answer+="2";
            }
        }
        
        return answer;
    }
}