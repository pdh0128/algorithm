/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x;
    int y;
} whkvy;


int main()
{
    int n;
    int min_x = 10000 , min_y = 10000;
    int max_x = -10000, max_y = -10000;
    scanf("%d", &n);
    whkvy R[100000];
    if (n == 1) {
        printf("0");
        return 0;
    }
    for(int i = 0; i < n; ++i) {
        scanf("%d %d", &R[i].x, &R[i].y);
        if (R[i].x > max_x) max_x = R[i].x;
        if (R[i].x < min_x) min_x = R[i].x;
        
        if (R[i].y > max_y) max_y = R[i].y;
        if (R[i].y < min_y) min_y = R[i].y;
    }
    printf("%d", abs(max_x - min_x) * abs(max_y - min_y));

    return 0;
}