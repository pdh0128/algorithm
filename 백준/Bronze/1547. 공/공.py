cups = [1, 2 ,3]
m = int(input())
for _ in range(m):
    x, y = map(int ,input().split())
    X = cups.index(x)
    Y = cups.index(y)
    cups[X], cups[Y] = cups[Y], cups[X]
print(cups[0]);