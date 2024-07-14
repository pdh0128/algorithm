#include <stdio.h>
#include <string.h>
int main() {
    char cap[100];
    int cnt = 0;
    scanf("%s", cap);
    int len = strlen(cap);
    cnt = strlen(cap);
    for(int i = 0; i < len; ++i) {
        if( (cap[i] == 'c' && cap[i + 1] == '=')
        || (cap[i] == 'c' && cap[i + 1] == '-')
        || (cap[i] == 'd' && cap[i + 1] == 'z' && cap[i + 2] == '=')
        || (cap[i] == 'd' && cap[i + 1] == '-')
        || (cap[i] == 'l' && cap[i + 1] == 'j')
        || (cap[i] == 'n' && cap[i + 1] == 'j')
        || (cap[i] == 's' && cap[i + 1] == '=')
        || (cap[i] == 'z' && cap[i + 1] == '=') )
        --cnt;
        else if (cap[i] == 'd' && cap[i + 1] == 'z' && cap[i + 2] == '=') cnt -= 2;
    }   
    printf("%d", cnt);
    return 0;
}