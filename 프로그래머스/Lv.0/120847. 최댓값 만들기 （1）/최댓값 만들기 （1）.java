import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int first_max=numbers[numbers.length-1];
        int second_max=numbers[numbers.length-2];
        
        answer=first_max*second_max;
        
        return answer;
    }
}