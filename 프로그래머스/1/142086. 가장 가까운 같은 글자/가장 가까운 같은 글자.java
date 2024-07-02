import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        String[] strArr = s.split("");
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            boolean found = false;
            for (int j = i - 1; j >= 0; j--) {
                if (strArr[i].equals(strArr[j])) {
                    answer.add(i - j);
                    found = true;
                    break;
                }
            }
            if (!found) {
                answer.add(-1);
            }
        }

        // List를 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}