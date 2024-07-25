#include <stdio.h>

int main()
{   
    int T;
    char str[1001];
    scanf("%d", &T);
    for(int i = 0; i < T; ++i) {
        scanf("%s", str);
        printf("%c", str[0]);
        for(int j = 0; str[j] != '\0'; ++j) {
            if (str[j + 1] == '\0') printf("%c\n", str[j]);
            
        }
    }
    
    return 0;
}