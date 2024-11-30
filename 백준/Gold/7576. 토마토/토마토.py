from collections import deque

M, N = map(int, input().split())
box = [list(map(int, input().split())) for _ in range(N)]

queue = deque()
directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

for i in range(N):
    for j in range(M):
        if box[i][j] == 1:
            queue.append((i, j))

while queue:
    x, y = queue.popleft()
    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < N and 0 <= ny < M and box[nx][ny] == 0:
            box[nx][ny] = box[x][y] + 1  
            queue.append((nx, ny))

max_days = 0
for row in box:
    for value in row:
        if value == 0: 
            print(-1)
            exit()
        max_days = max(max_days, value)

print(max_days - 1)
