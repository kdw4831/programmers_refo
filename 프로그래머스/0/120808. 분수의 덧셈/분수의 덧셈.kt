class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        val denom: Int = denom1 *  denom2
        val numer: Int = denom1 * numer2 + denom2 * numer1
        
        for(i in denom downTo 1){
            if(denom % i == 0 && numer % i == 0 ){
                answer[0] = numer / i
                answer[1] = denom / i
                break;
            }
        }
        
        return answer
    }
}