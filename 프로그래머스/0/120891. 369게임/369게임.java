class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr=String.valueOf(order).split("");
        for(String tmp : arr){
            int num=Integer.parseInt(tmp);
           if(num%3==0 && num!=0){
               
               answer++;
           } 
        }
        return answer;
    }
}