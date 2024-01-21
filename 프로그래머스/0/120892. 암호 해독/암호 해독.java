class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipher_arr= cipher.split("");
        for(int i=1; i<=cipher_arr.length/code; i++){
            answer+=cipher_arr[i*code-1];
        }
        return answer;
    }
}