import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        List<Integer> list= new ArrayList<>();
        for(String Dic :dic){
            int S_count=0;  
            for(String Spell :spell){
                if(Dic.contains(Spell)){
                    S_count++;
                }
                if(S_count==spell.length)list.add(1);
                else list.add(2);
                
                
            }
        }
        
        list.forEach(item->{
            System.out.println(item);
        });
        if(list.contains(1))answer=1;
        else answer=2;
       //System.out.println(S_count/dic.length+" "+spell.length);
        
        return answer;
    }
}