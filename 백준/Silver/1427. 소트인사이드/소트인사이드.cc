#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare_desc(const void *a, const void *b) {
    return (*(char *)b - *(char *)a);
}

int main() {
    char n[11];
    scanf("%s", n);
    int length = strlen(n);
    qsort(n, length, sizeof(char), compare_desc);
    printf("%s\n", n);

    return 0;
}
