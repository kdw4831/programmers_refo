class Solution {
    public static int toSec(String time){
        int minute = Integer.parseInt(time.substring(0,2));
        int sec = Integer.parseInt(time.substring(3,5));
        
        int sum_sec = sec +minute*60;
        
        return sum_sec;
        
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int sec_video_len = toSec(video_len);
        int sec_pos = toSec(pos);
        int sec_op_start = toSec(op_start);
        int sec_op_end = toSec(op_end);
        
        System.out.println("video_len: " + sec_video_len);
        System.out.println("pos: " + sec_pos);
        System.out.println("op_start: " + sec_op_start);
        System.out.println("op_end: " + sec_op_end);

        
        for(String tmp : commands){
            if(sec_pos>=sec_op_start && sec_pos<=sec_op_end) sec_pos = sec_op_end;            
            
            if(tmp.equals("next")){
                if(sec_video_len <= 10 + sec_pos) sec_pos = sec_video_len;
                else sec_pos+=10;
            }else{
                if(sec_pos <=10) sec_pos = 0;
                else sec_pos-=10;
            }
            if(sec_pos>=sec_op_start && sec_pos<=sec_op_end) sec_pos = sec_op_end;
        }
        System.out.println(sec_pos);
        int minute = sec_pos/60;
        int sec = sec_pos % 60;
        
        
        
        if(minute < 10) answer = "0"+String.valueOf(minute)+":";
        else answer = String.valueOf(minute)+":";
        
        if(sec < 10) answer+="0"+String.valueOf(sec);
        else  answer+=String.valueOf(sec);
        
        return answer;
    }
}