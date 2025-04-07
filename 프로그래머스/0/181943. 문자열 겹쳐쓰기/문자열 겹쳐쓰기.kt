class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
       
        
        val sb = StringBuilder()
        sb.append(my_string)
        
        for( i in  overwrite_string.indices){
            sb[i+s] = overwrite_string[i]
        }
        
        
       
        return sb.toString()
    }
}