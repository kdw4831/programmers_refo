class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
            
        for(String tmp : keyinput){
            if(tmp.equals("up") && answer[1]<(board[1]/2)){
                answer[1]+=1;
            }else if(tmp.equals("down") && answer[1]>-(board[1]/2)){
                answer[1]-=1;

            }else if(tmp.equals("left") && answer[0]>-(board[0]/2)){
                answer[0]-=1;
            }else if(tmp.equals("right") && answer[0]<(board[0]/2)){
                answer[0]+=1;
            }
        }

        return answer;
    }
}