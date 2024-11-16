n = list(map(int, input().split()))
for i in range(3):
    for j in range(3):
        if n[i] < n[j]:
            n[i], n[j] = n[j], n[i]
print(n[0], n[1], n[2])