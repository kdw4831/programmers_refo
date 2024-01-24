class Solution {
    public String[] solution(String my_str, int n) {
       
        
        String[] strarr=my_str.split("");
        int answer_len=strarr.length/n+(strarr.length%n==0 ? 0:1);
        String[] answer = new String[answer_len];
        int idx=0;
        
        for(int i=0; i<answer_len; i++){
            answer[i]="";
            for(int j=0; j<n; j++){
                if(strarr.length>idx){
                    answer[i]+=strarr[idx];
                    idx++;
                }
            }
        }
        return answer;
    }
}