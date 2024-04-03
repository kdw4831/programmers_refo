#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// common_len은 배열 common의 길이입니다.
int solution(int common[], size_t common_len) {
    int answer = 0;
    int i = common_len-1;
        if (common[i] - common[i - 1] == common[i - 1] - common[i - 2])
           answer = (common[i]-common[i-1])+common[i];
        else answer = (common[i]/common[i-1])*common[i]; 
    return answer;
} 