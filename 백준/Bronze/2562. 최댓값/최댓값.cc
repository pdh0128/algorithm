#include <stdio.h>

int main() {
    int n, max = 0;
    int N[101];
    int i = 0;
    while(i < 9){
        scanf("%d", &N[i]);
        if (N[i] > max) {max = N[i] ; n = i + 1;}
        ++i;
    }
    printf("%d\n%d", max, n);
    return 0;
}