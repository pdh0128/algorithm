from collections import deque
T = int(input())

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# def dfs(x, y):
#     farm[y][x] = 0
#     for i in range(4):
#         nx, ny = x + dx[i], y + dy[i]
#         if 0 <= nx < m and 0 <= ny < n and farm[ny][nx]:
#             dfs(nx, ny)

def bfs(x, y):
    queue = deque([(x, y)])
    farm[y][x] = 0
    while queue:
        node = queue.popleft()
        for i in range(4):
            nx, ny = node[0] + dx[i], node[1] + dy[i]
            if 0 <= nx < m and 0 <= ny < n and farm[ny][nx]:
                queue.append((nx, ny))
                farm[ny][nx] = 0
for _ in range(T):
    m, n, k = map(int, input().split())
    farm = [[0] * m for _ in range(n)]
    for _ in range(k):
        x, y = map(int, input().split())
        farm[y][x] = 1
    count = 0
    for i in range(n):
        for j in range(m):
            if farm[i][j] == 1:
                #dfs(j, i)
                bfs(j, i)
                count += 1
    print(count)