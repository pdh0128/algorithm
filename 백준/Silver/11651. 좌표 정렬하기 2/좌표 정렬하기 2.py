n = int(input())

coordinate = list()
for i in range(n):
    x, y = map(int, input().split())
    coordinate.append((x, y))
coordinate.sort(key=lambda coordi : (coordi[1], coordi[0]))
for i in range(n):
    print(coordinate[i][0], coordinate[i][1])