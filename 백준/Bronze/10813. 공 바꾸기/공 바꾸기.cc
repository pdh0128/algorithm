#include <stdio.h>

int main() {
    int M, N, o[101] = {};
    int b, b2, save;
    scanf("%d %d", &N, &M);
    for(int i = 1; i <= N; ++i) {
        o[i] = i;
    }
    
    for(int i = 0; i < M; ++i) {
        scanf("%d %d", &b, &b2);
        save = o[b]; 
        o[b] = o[b2]; o[b2] = save;
    }
    
    for(int i = 1; i <= N; ++i) {
        printf("%d ", o[i]);
    }
    return 0;
}