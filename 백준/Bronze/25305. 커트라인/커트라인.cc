
#include <stdio.h>

int main()
{
    int N;
    int k;
    scanf("%d %d", &N, &k);
    int student[N];
    for(int i = 0; i < N; ++i) {
        scanf("%d", &student[i]);
    }
    for(int i = 0; i < N - 1; ++i) {
        int min = i;
        for(int j = i + 1; j < N; ++j) {
            if (student[j] < student[min]) min = j;
        }
        int temp = student[i];
        student[i] = student[min];
        student[min] = temp;
    }
    printf("%d", student[N - k]);
    return 0;
}