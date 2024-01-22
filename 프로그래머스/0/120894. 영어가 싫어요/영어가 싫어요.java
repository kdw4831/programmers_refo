import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
       
        Map<String,String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        Map<Integer,String> r_map= new HashMap<>();
        r_map.put(0,"zero");
        r_map.put(1,"one");
        r_map.put(2,"two");
        r_map.put(3,"three");
        r_map.put(4,"four");
        r_map.put(5,"five");
        r_map.put(6,"six");
        r_map.put(7,"seven");
        r_map.put(8,"eight");
        r_map.put(9,"nine");
        
        for(int i=0; i< map.size(); i++){
           numbers=numbers.replace(r_map.get(i),map.get(r_map.get(i)));
        }
            answer=Long.parseLong(numbers);
        return answer;
        
    }
}