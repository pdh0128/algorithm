#include <stdio.h>

int main(){
    int one, two, two_two, two_three;
    scanf("%d\n%1d%1d%1d", &one, &two, &two_two, &two_three);
    printf("%d\n", one * two_three);
    printf("%d\n", one * two_two);
    printf("%d\n", one * two);
    printf("%d", one * two_three + (one * two_two * 10) + (one * two * 100));
    return 0;
}