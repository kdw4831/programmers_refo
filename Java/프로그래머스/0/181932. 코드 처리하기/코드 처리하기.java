class Solution {
    public String solution(String code) {
        // boolean mode 로 두고 1=>true  0=>false 라면 
        // 문자열 1을 만났을 때 mode는 상반되게 변경
        // mode가 false일 때  answer(ret)에 인덱스가 짝수인 값 추가
        // mode가 true일 때 answer(ret)에 인덱스가 홀수인 값 추가
        // answer(ret)문자열을 리턴
        String answer = "";
        int mode = 0;
        char[] codeArr = code.toCharArray();
        
        for(int i=0; i<codeArr.length; i++){
            if(codeArr[i] == '1'){
                if(mode==1) mode=0;
                else mode=1;
            }
            else if(mode == 0 && i%2==0)answer+=String.valueOf(codeArr[i]);
            else if(mode==1 && i%2==1)answer+=String.valueOf(codeArr[i]);
        }
            
        if(answer.equals("")) return "EMPTY";
        else return answer;
    }
}