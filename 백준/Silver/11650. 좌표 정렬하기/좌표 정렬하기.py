n = int(input())

coordinate = list()
for i in range(n):
    x, y = map(int, input().split())
    coordinate.append((x, y))
coordinate.sort(key=lambda coordi : (coordi[0], coordi[1]))
for i in range(n):
    print(coordinate[i][0], coordinate[i][1])