//1) 빈도수가 높은 값을 리턴한다.
//2) 빈도수가 높은 값이 2개 이상이면  -1을 리턴한다. 
/*
   - array의 원소 값이 맥스일 때가 999 그럼 배열의 크기가
    1000 길이의 배열을 새롭게 Index라는 이름의 이름으로 만들어서 배열의 인덱스 값을 
    원소라고 생각하고 array의 원소값과 인덱스 값이 일치 할 때 1씩 증가하게 한다.

   - 또한 Index 배열에서 반복문을 돌려서 원소값이 가장 큰 값의 인덱스를 뽑아내어 출력한다.
     단, 중복값이 있으면  -1을 출력하도록 한다. 
     중복 값 해결은 중복값을 체크하기 위한 변수 ? boolean값?
*/
class Solution {
    fun solution(array: IntArray): Int {

        return array.groupBy{it}.map{it.value.size to it.key}
        .sortedByDescending{it.first}
        .let{
            if(it.size>1 && it[0].first == it[1].first) -1 else it.first().second
        }
    
    }
}