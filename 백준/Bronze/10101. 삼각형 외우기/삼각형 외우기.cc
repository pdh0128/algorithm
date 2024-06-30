/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int a, b, c;
    scanf("%d\n%d\n%d", &a, &b, &c);
    if(a + b + c == 180) {
        printf("%s", a == 60 && b == 60 && c == 60 ? "Equilateral" : 
        a != b && a != c && b != c ? "Scalene" : "Isosceles");
    }
    else printf("Error");
    return 0;
}