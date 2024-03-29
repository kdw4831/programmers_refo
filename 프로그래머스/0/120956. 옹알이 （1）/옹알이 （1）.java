class Solution {
    public int solution(String[] babbling) {
        int answer = 0; 
        /*
            "aya","ye","woo", "ma" 한번씩만 사용해야한다. ㅇㅋ?
            babbling 배열안에 스트링이 위 문자열을 조합해서 만들어 졌으면 => count++
        */
        
        String[] strArr = {"aya","ye","woo", "ma"};
  
        
        for(String tmp: babbling){
            for(String verb :strArr){
                if(tmp.contains(verb)){
                    tmp=tmp.replace(verb, ".");
                    if(tmp.replace(".", "").length() == 0){
                        answer++;
                    }
                }
                
               
            }
    
        }
        
        
                
        
        return answer;
    
    
    }
}
