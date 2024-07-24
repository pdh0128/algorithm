#include <stdio.h>

int main() {
    int dice1, dice2, dice3, reward = 0;
    scanf("%d %d\n%d", &dice1, &dice2, &dice3);
    if (dice1 == dice2 && dice2 == dice3) reward = 10000 + dice1 * 1000;
    else if (dice1 != dice2 && dice2 != dice3 && dice3 != dice1) 
        reward = 100 * ( dice1 > (dice2 > dice3 ? dice2 : dice3) ? dice1 : (dice2 > dice3 ? dice2 : dice3) );
    else 
    {
        if (dice1 == dice2 && dice1 != dice3 && dice2 != dice3) reward = 1000 + dice1 * 100;
        else if (dice2 == dice3 && dice2 != dice1 && dice3 != dice1) reward = 1000 + dice2 * 100;
        else if (dice3 == dice1 && dice3 != dice2 && dice1 != dice2) reward = 1000 + dice3 * 100;
    }
    printf("%d", reward);
    return 0;
}