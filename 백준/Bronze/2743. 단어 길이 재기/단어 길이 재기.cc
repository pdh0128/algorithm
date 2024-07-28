#include <stdio.h>

int main()
{
    char str[101];
    int cnt = 0;
    scanf("%s", str);
    for(int i = 0; str[i] != '\0' ; ++i, ++cnt);
    printf("%d", cnt);
    return 0;
}