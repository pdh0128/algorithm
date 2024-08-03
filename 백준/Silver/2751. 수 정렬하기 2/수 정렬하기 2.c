#include <stdio.h>
#include <stdlib.h>


int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int main() {
    int n;
    scanf("%d", &n);

    int *arr = malloc(n * sizeof(int)); 
    if (arr == NULL) {
        fprintf(stderr, "메모리 할당 실패\n");
        return 1;
    }

    for (int i = 0; i < n; ++i) {
        scanf("%d", &arr[i]);
    }

    qsort(arr, n, sizeof(int), compare);

    for (int i = 0; i < n; ++i) {
        printf("%d\n", arr[i]);
    }

    free(arr); 

    return 0;
}
