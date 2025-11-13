class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        // 홀수 인경우
        if(len%2 == 1){
            answer = String.valueOf(s.charAt(len/2));
        }else{
            answer = s.substring(len/2-1,len/2+1);
        }
        return answer;
    }
}