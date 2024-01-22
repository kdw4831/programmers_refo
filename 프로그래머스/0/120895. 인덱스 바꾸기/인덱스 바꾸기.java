class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String tmp= "";
        String[] arr=my_string.split("");
        tmp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=tmp;
        
        for(String item: arr){
            answer+=item;
        }
            
        return answer;
    }
}