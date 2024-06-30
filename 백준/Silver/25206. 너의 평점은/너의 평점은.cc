#include <stdio.h>
struct major {
    char name[50];
    float score;
    char rank[3];
};

int main () {
    struct major jihoon[20];
    float multiply = 0;
    float score = 0;
    
    for(int i = 0 ; i < 20; ++i) {
        scanf("%s %f %s", jihoon[i].name, &jihoon[i].score, jihoon[i].rank);

    }
    for(int i = 0 ; i < 20; ++i) {
        if (jihoon[i].rank[0] == 'A') {
            if (jihoon[i].rank[1] == '+') multiply += 4.5 * jihoon[i].score;
            else multiply += 4.0 * jihoon[i].score;
        }
        else if (jihoon[i].rank[0] == 'B') {
            if (jihoon[i].rank[1] == '+') multiply += 3.5 * jihoon[i].score;
            else multiply += 3.0 * jihoon[i].score;
        }
        else if (jihoon[i].rank[0] == 'C') {
            if (jihoon[i].rank[1] == '+') multiply += 2.5 * jihoon[i].score;
            else multiply += 2.0 * jihoon[i].score;
        }
        else if (jihoon[i].rank[0] == 'D') {
            if (jihoon[i].rank[1] == '+') multiply += 1.5 * jihoon[i].score;
            else multiply += 1.0 * jihoon[i].score;
        }
        else multiply += 0.0 * jihoon[i].score;
      
        if (jihoon[i].rank[0] != 'P') score += jihoon[i].score;
    }
    printf("%lf", multiply / score);
    return 0;
}