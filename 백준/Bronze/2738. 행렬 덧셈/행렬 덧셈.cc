#include <stdio.h>
int main(void){
    int x, y, a = 0, b = 0;
    int arr1[10000];
    int arr2[10000];
    scanf("%d %d",&x, &y);
    for(int i=0;i < x; i++){
        for(int j=0;j < y;j++){
            scanf("%d",&arr1[a]);
            a++;
        }
    }
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            scanf("%d",&arr2[b]);
            b++;
        }
    }
    a=0;
    b=0;
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            printf("%d ",arr1[a]+arr2[b]);
            ++a;++b;
        }
        printf("\n");
    }
    return 0;
}