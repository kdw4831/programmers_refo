class Solution {
    fun solution(numbers: IntArray): IntArray {
        for(i in 0 until numbers.size){
            numbers[i] *= 2 
        }
        
        return numbers
    }
}