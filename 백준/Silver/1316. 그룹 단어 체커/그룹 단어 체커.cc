#include <stdio.h>
#include <string.h>

int main () {
    int N, group, cnt = 0;
    char str[100];
    scanf("%d", &N);
    for(int i = 0; i < N;  ++i) {
        scanf("%s", str);
        group = 1;
        
        for(int j = 0; j < strlen(str); ++j) {
            for(int p = 0; p < j; ++p) {
                if(str[j] == str[p] && str[j] != str[j - 1]) {
                    group = 0;
                    break;
                }
            }
            if(group == 0) break;
        }
        if(group == 1) ++cnt;
    }
    printf("%d", cnt);
    
    return 0;
}