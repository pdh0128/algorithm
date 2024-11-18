from typing import List

com = int(input())
n = int(input())
table = {}
for _ in range(n):
    a, b = map(int, input().split())
    if a not in table:
        table[a] = []
    if b not in table:
        table[b] = []
    table[a].append(b)
    table[b].append(a)

vis = set()
def dfs(node):
    vis.add(node)
    if node in table:
        for i in table[node]:
            if i not in vis:
                dfs(i)
dfs(1)
print(len(vis) - 1)