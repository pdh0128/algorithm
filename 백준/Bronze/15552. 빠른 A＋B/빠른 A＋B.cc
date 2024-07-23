#include <stdio.h>

int main() {
    int N, a, b, total = 0;
    scanf("%d", &N);
    for (int i = 0; i < N; ++i){
        scanf("%d %d", &a, &b);
        printf("%d\n", a + b);
    }
    return 0;
}