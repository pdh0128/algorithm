
#include <stdio.h>
#include <string.h>
int main()
{
    char s[101];
    int alfabat[26];
    scanf("%s", s);
    
    for(int i  = 0; i < 26; i++) {
        alfabat[i] = -1;
    }
    
    
    for(int i  = 0; i < strlen(s); i++) {
        for(char c = 'a'; c <= 'z'; ++c) {
            if (s[i] == c && alfabat[c - 97] == -1) alfabat[c - 97] = i;
        }
    }
    
    for(int i  = 0; i < 26; ++i) {
        printf("%d ", alfabat[i]);
    }
    
    
    
    
    return 0;
}
