class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            String[] strarr=String.valueOf(array[i]).split("");
            for(int j=0; j<strarr.length; j++){
                if(Integer.parseInt(strarr[j])==7){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}