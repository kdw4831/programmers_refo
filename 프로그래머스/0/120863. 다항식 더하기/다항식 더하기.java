import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int coefficient=0; //계수
        int constant=0; //상수
        String[] arr= polynomial.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x") ){
                if(arr[i].split("").length != 1){
                    coefficient+=Integer.parseInt(arr[i].replace("x",""));
                }else{
                    coefficient+=1;    
                }
                
            }else if(!arr[i].equals("+")){ //상수 조건
                constant+=Integer.parseInt(arr[i]);    
            }
            
        }
        String Coefficient= String.valueOf(coefficient);
        String Constant = String.valueOf(constant);
        if(constant!=0 && coefficient!=0){
            if(coefficient==1){
                answer="x + "+Constant;
            }else{
                answer=Coefficient+"x + "+Constant;    
            }
            
        }else if(constant==0 && coefficient!=0){
            if(coefficient==1){
                answer="x";
            }else{
                answer=Coefficient+"x";    
            }
            
        }else if(coefficient==0){
            answer=Constant;
        }
        
        return answer;
    }
}