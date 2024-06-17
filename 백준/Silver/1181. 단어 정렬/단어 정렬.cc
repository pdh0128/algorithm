#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_WORDS 20000
#define MAX_WORD_LENGTH 50

// 비교 함수 정의: 길이 우선, 길이가 같으면 사전순
int compare(const void *a, const void *b) {
    const char *word1 = *(const char **)a;
    const char *word2 = *(const char **)b;
    int len1 = strlen(word1);
    int len2 = strlen(word2);
    
    if (len1 != len2) 
        return len1 - len2;
    return strcmp(word1, word2);
}

int main() {
    int N;
    char *words[MAX_WORDS];
    int unique_count = 0;

    scanf("%d", &N);
    for(int i = 0; i < N; ++i) {
        char temp[MAX_WORD_LENGTH];
        scanf("%s", temp);

        // 중복 체크
        bool is_duplicate = false;
        for (int j = 0; j < unique_count; ++j) {
            if (strcmp(temp, words[j]) == 0) {
                is_duplicate = true;
                break;
            }
        }

        if (!is_duplicate) {
            words[unique_count] = strdup(temp); // 중복이 아니면 배열에 추가
            unique_count++;
        }
    }

    // qsort를 사용하여 정렬
    qsort(words, unique_count, sizeof(char *), compare);

    // 출력
    for(int i = 0; i < unique_count; ++i) {
        printf("%s\n", words[i]);
        free(words[i]); // 동적 메모리 해제
    }

    return 0;
}
