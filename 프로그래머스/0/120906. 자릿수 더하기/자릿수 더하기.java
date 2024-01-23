class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] arr= String.valueOf(n).split("");
        for(String tmp : arr){
            answer+=Integer.parseInt(tmp);
        }
        return answer;
    }
}