/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int sum = 0;
    int score;
    for(int i = 0; i < 5; ++i) {
        scanf("%d", &score);
        sum += score;
    }
    printf("%d", sum);
    return 0;
}