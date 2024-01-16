class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        //array의 원소를 배열의 인덱스로
        int [] arr= new int[1000];
        //최빈값
        int mode=0;
        //반복횟수
        int count=0;
        for(int i=0; i<array.length; i++){
            arr[array[i]]++;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[mode]<arr[i]){
                
                mode=i;
 
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[mode]==arr[j]){
                count++;
            }
        }
        
        if(count>1){
            answer=-1;
        }else{
            answer=mode;
        }
        
        return answer;
    }
}