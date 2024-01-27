class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int danger=-1;
        System.out.println(board.length);
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                
                if(board[i][j]==1 && board.length !=1){
                    if(i==0 && j==0){
                        board[i][j+1]=(board[i][j+1]==1)?1:danger;
                        board[i+1][j]=(board[i+1][j]==1)?1:danger;
                        board[i+1][j+1]=(board[i+1][j+1]==1)?1:danger;
                    }else if(i==0 && j==board.length-1){
                        board[i+1][j-1]=(board[i+1][j-1]==1)?1:danger;
                        board[i][j-1]=(board[i][j-1]==1)?1:danger;
                        board[i+1][j]=(board[i+1][j]==1)?1:danger;
                    }else if(i==board.length-1 && j==0){
                        board[i-1][j]=(board[i-1][j]==1)?1:danger;
                        board[i-1][j+1]=(board[i-1][j+1]==1)?1:danger;
                        board[i][j+1]=(board[i][j+1]==1)?1:danger;
                    }else if(i==board.length-1 && j==board.length-1){
                        board[i][j-1]=(board[i][j-1]==1)?1:danger;
                        board[i-1][j-1]=(board[i-1][j-1]==1)?1:danger;
                        board[i-1][j]=(board[i-1][j]==1)?1:danger;
                    }else if(i==0){
                        board[i][j+1]=(board[i][j+1]==1)?1:danger;
                        board[i][j-1]=(board[i][j-1]==1)?1:danger;
                        board[i+1][j-1]=(board[i+1][j-1]==1)?1:danger;
                        board[i+1][j]=(board[i+1][j]==1)?1:danger;
                        board[i+1][j+1]=(board[i+1][j+1]==1)?1:danger;

                    }else if(i==board.length-1){
                        board[i][j+1]=(board[i][j+1]==1)?1:danger;
                        board[i][j-1]=(board[i][j-1]==1)?1:danger;
                        board[i-1][j-1]=(board[i-1][j-1]==1)?1:danger;
                        board[i-1][j]=(board[i-1][j]==1)?1:danger;
                        board[i-1][j+1]=(board[i-1][j+1]==1)?1:danger;


                    }else if(j==0){
                        board[i][j+1]=(board[i][j+1]==1)?1:danger;
                        board[i-1][j]=(board[i-1][j]==1)?1:danger;
                        board[i-1][j+1]=(board[i-1][j+1]==1)?1:danger;
                        board[i+1][j]=(board[i+1][j]==1)?1:danger;
                        board[i+1][j+1]=(board[i+1][j+1]==1)?1:danger;

                    }else if(j==board.length-1){
                        board[i-1][j-1]=(board[i-1][j-1]==1)?1:danger;
                        board[i][j-1]=(board[i][j-1]==1)?1:danger;
                        board[i-1][j]=(board[i-1][j]==1)?1:danger;
                        board[i+1][j-1]=(board[i+1][j-1]==1)?1:danger;
                        board[i+1][j]=(board[i+1][j]==1)?1:danger;
                  
                    }else{
                        board[i][j+1]=(board[i][j+1]==1)?1:danger;
                        board[i][j-1]=(board[i][j-1]==1)?1:danger;
                        board[i-1][j-1]=(board[i-1][j-1]==1)?1:danger;
                        board[i-1][j]=(board[i-1][j]==1)?1:danger;
                        board[i-1][j+1]=(board[i-1][j+1]==1)?1:danger;
                        board[i+1][j-1]=(board[i+1][j-1]==1)?1:danger;
                        board[i+1][j]=(board[i+1][j]==1)?1:danger;
                        board[i+1][j+1]=(board[i+1][j+1]==1)?1:danger;

                    }
                }                 
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==0){
                    answer++;
                }
                
            }
        }
        System.out.println(answer);
        return answer;
    }
}