#include <stdio.h>

int main()
{   
    int a, b, w, h;
    scanf("%d %d\n%d %d", &a, &b, &w, &h);
    printf("%d", (w - a < a ? w - a : a) < (h - b < b ? h - b : b) ? (w - a < a ? w - a : a) : (h - b < b ? h - b : b));
    return 0;
}
