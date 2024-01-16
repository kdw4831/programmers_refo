class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string=my_string.replaceAll("[a-zA-Z]","");
        String[] arr= my_string.split("");
        for(String tmp: arr){
            answer+=Integer.parseInt(tmp);
        }
        return answer;
    }
}