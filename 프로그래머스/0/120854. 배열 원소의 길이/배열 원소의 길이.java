class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx=0;
        for(String tmp :strlist){
            answer[idx]=tmp.length();
            idx++;
        }
        
        
        
        return answer;
    }
}