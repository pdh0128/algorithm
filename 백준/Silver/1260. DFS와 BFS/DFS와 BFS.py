from collections import deque
n, m, v = map(int, input().split())
table = {}
for _ in range(m):
    a, b = map(int, input().split())
    if a not in table:
        table[a] = []
    if b not in table:
        table[b] = []
    table[a].append(b)
    table[b].append(a)
    table[a].sort()
    table[b].sort()
dvis = set()
bvis = set()

def dfs(node):
    dvis.add(node)
    print(node, end=" ")
    if node in table:
        for item in table[node]:
            if item not in dvis:
                dfs(item)
def bfs(start):
    queue = deque([start])
    while queue:
        node = queue.popleft()
        bvis.add(node)
        print(node, end=" ")
        if node in table:
            for item in table[node]:
                if item not in bvis:
                    bvis.add(item)
                    queue.append(item)

dfs(v)
print()
bfs(v)