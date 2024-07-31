/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n[5];
    int avg = 0;
    for(int i = 0; i < 5; ++i) {
        scanf("%d", &n[i]);
        avg += n[i];
    }
    avg /= 5;
    for(int i = 0; i < 4; ++i) {
        int min = i;
        for(int j = i; j < 5; ++j) {
            if (n[j] < n[min]) min = j;
        }
        int temp = n[i];
        n[i] = n[min];
        n[min] = temp;
    }
    
    printf("%d\n%d", avg, n[2]);
    return 0;
}