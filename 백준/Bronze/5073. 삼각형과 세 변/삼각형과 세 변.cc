/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int a, b, c;
    int max = 0;
    while(1) {
        scanf("%d %d %d", &a, &b, &c);
        if (!a && !b && !c) break;
        max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        if (max < (a + b + c - max)) {
            printf("%s\n", a == b && b == c && c == a ? "Equilateral" : 
            a != b && a != c && b != c ? "Scalene" : "Isosceles");
        }
        else printf("Invalid\n");
    }
    return 0;
}