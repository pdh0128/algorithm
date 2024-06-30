#include <stdio.h>

typedef struct {
    int w; //weight
    int h; //height
    int r; //ranking
} s;

int main()
{   
    int n;
    scanf("%d", &n);
    s p[n]; // people[n];
    for(int i = 0; i < n; ++i) {
        scanf("%d %d", &p[i].w , &p[i].h);
        p[i].r = 1;
    }
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if (p[i].w < p[j].w && p[i].h < p[j].h) p[i].r += 1;
        }
    }
    
    for(int i = 0; i < n; ++i) {
        printf("%d ", p[i].r);
    }
    return 0;
}
