#include <stdio.h>

int main()
{   
    int n, m;
    int min = 0;
    int sum = 0;
    int sign = 1;
    int not_;
    scanf("%d\n%d", &m, &n);
    for(int i = m; i <= n; ++i) {
        if (i == 2) {
            sum += i;
            if (sign) {min = i; sign = 0;}
            continue;
        }
        else if (i == 1) continue;
        not_ = 0;
        for(int j = 2; j < i; ++j) {
            if (i % j == 0) not_ = 1;
        }
        if (not_ != 1) {
            sum += i;
            if (sign) {min = i; sign = 0;}
        }
    }
    
    if (!(sum)) printf("-1");
    else printf("%d\n%d", sum, min);
    return 0;
}
