#include <stdio.h>

int main () {
    int n;
    int confirm;
    while (1) {
        confirm = 0;
        scanf("%d", &n);
        if (n == -1) break;
        for(int i = 1; i < n; ++i) {
            if (!(n % i)) confirm += i;
        }
        
        if (confirm == n) {
            printf("%d = ", n);
            confirm = 0;
            for(int i = 1; i < n; ++i) {
                if (!(n % i)) {
                    confirm += i;
                    printf("%d", i);
                    if (confirm == n) {printf("\n"); break;}
                    printf(" + ");
                }
            }
        }
        else printf("%d is NOT perfect.\n", n);
    }
    return 0;
}
