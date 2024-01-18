import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> pF = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                pF.add(i);
                n = n/i;
            }
        }
        Set<Integer> setpF=new HashSet<>(pF);
        ArrayList<Integer> answer= new ArrayList<>(setpF);
        Collections.sort(answer);
        return answer;
    }
}