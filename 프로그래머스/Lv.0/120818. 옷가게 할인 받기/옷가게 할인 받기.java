import java.lang.Math;
class Solution {
    public int solution(int price) {
        int answer = 0;
        double bill = 0;
        if(price>=500000){
            bill=price*(1.0-0.2);
        }else if(price>=300000){
            bill=price*(1.0-0.1);            
        }else if(price>=100000){
            bill=price*(1.0-0.05);
        }else{
            bill=price;
            
        }
        //answer=(int)Math.floor(bill*0.1)*10;
        answer=(int)bill;
        return answer;
    }
}