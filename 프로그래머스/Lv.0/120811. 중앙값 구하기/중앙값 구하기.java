import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        
        
        Arrays.sort(array);
        int m_index=array.length/2;
        int answer=array[m_index];
        return answer;
    }
}