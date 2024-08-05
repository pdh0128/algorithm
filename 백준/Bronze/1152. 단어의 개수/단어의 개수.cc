
#include <stdio.h>
#include <string.h>

int main()
{
    int n = 0;
    char s[1000001];
    scanf("%[^\n]s", s);
    for(int i = 0; i < strlen(s); ++i) {
        if (s[i] == ' ' && (s[i + 1] != ' ' && s[i + 1] != '\0')) ++n;
    }
    if (s[0] != ' ') ++n;
    printf("%d", n);
    return 0;
}
