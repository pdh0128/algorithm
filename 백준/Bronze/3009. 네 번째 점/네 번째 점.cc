#include <stdio.h>
typedef struct {
    int x;
    int y;
} coordinate;
int main()
{   
    coordinate n1, n2, n3, n4;
    scanf("%d %d\n%d %d\n%d %d", &n1.x, &n1.y, &n2.x, &n2.y, &n3.x, &n3.y);
    n4.x = (n1.x == n2.x) ? n3.x : (n2.x == n3.x) ? n1.x : (n3.x == n1.x) ? n2.x : 0;
    n4.y = (n1.y == n2.y) ? n3.y : (n2.y == n3.y) ? n1.y : (n3.y == n1.y) ? n2.y : 0;
    printf("%d %d", n4.x, n4.y);
    return 0;
}
