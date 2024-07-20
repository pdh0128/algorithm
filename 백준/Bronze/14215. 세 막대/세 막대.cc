#include <stdio.h>

int main()
{
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);
    if (a > b) { int temp = a; a = b; b = temp; }
    if (b > c) { int temp = b; b = c; c = temp; }
    if (a > b) { int temp = a; a = b; b = temp; }
    while (c >= a + b) {
        c--;
    }
    int perimeter = a + b + c;
    printf("%d", perimeter);

    return 0;
}
