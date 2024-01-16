import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String chars="abcdefghij";
        HashMap<Integer,Character> map= new HashMap<>();
        String Age=String.valueOf(age);
        char[] ageArr=new char[Age.length()];
        
       
        
        for(int i=0; i<chars.length(); i++){
            map.put(i,chars.charAt(i));
        }
       
        
        for(int i=0; i<Age.length(); i++){
            int resultAge=Integer.parseInt(String.valueOf(Age.charAt(i)));
                
            answer+=map.get(resultAge);
        }
        System.out.println(ageArr[0]);
        
        return answer;
    }
}