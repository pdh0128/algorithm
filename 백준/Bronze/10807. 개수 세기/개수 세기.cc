#include <stdio.h>

int main() {
    int v;
    int a[101];
    int N;
    int cnt = 0;
    scanf("%d", &N);
    for (int i = 0; i < N; ++i){
        scanf("%d ", &a[i]);
    }
    scanf("%d", &v);

     for(int i = 0; i < N; ++i){
    if (v == a[i]) ++cnt;
    }
    printf("%d", cnt);
    return 0;
}