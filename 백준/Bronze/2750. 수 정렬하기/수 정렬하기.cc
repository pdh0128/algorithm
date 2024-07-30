/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int nn[n];
    for(int i = 0; i < n; ++i) {
        scanf("%d", &nn[i]);
    }
    
    for(int i = 0; i < n - 1; ++i) {
        int min = i;
        for(int j = i + 1; j < n; ++j) {
            if (nn[j] < nn[min]) min = j;
        }
        int temp = nn[min];
        nn[min] = nn[i];
        nn[i] = temp;
    }
    for(int i = 0; i < n; ++i) {
        printf("%d\n", nn[i]);
    }

    
    return 0;
}