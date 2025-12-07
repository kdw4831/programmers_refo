class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        //상하 좌우 좌표 
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1}; 
        int len = board.length; //board 길이 
        String curColor = board[h][w]; //h,w 위치의 색
        for(int i=0; i<4; i++){  
            int nh=h+dh[i];
            int nw=w+dw[i];
            //경계값 조건 
            boolean isBoundarySuccess = nh>=0 && nh<len && nw>=0 && nw<len; 
            //경계값 조건 + 색상일치 여부 
            if( isBoundarySuccess && curColor.equals(board[nh][nw])) count++; 
        }
        
        
        return count;
    }
}