#include <stdio.h>
#include <string.h>

int main() {
    char s[1000000];
    int alphabet[27] = {}; 
    float most = 0.5;
    int confirm = 0;
    int seat;
    scanf("%s", s);
    int a = strlen(s);
    for(int i = 0; i < a; ++i) {
        if (s[i] >= 'a') ++alphabet[s[i] - 'a'];
        else if (s[i] >= 'A') ++alphabet[s[i] - 'A'];
    }
    for(int i = 0; i < 26; ++i) {
        if (alphabet[i] > most) {most = alphabet[i]; seat = i; confirm = 0;}
        else if (alphabet[i] == most) ++confirm;
    }
    printf("%c", confirm < 1 ?  seat + 65 : '?');
    return 0;
}