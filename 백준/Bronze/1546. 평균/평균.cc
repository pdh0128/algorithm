#include <stdio.h>

int main()
{
    int n, M = 0;
    int score[1001];
    double new_score = 0;
    double ave;
    scanf("%d", &n);
    for(int i = 0; i < n; ++i) {
        scanf("%d", &score[i]);
        if (score[i] > M) M = score[i];
    }
    
    for(int i = 0; i < n; ++i) 
        new_score += (double)score[i] / M * 100;
    
    ave = new_score / n;
    printf("%g", ave);
    return 0;
}