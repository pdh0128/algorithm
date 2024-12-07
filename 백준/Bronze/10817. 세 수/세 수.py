a = []
a.extend(map(int, input().split()))
b = [0] * (max(a) + 1)
for i in a:
    b[i] += 1
for i in range(1, len(b)):
    b[i] = b[i] + b[i - 1]
sorted = [0] * len(a)
a.reverse()
for i in a:
    sorted[b[i] - 1] = i
    b[i] -= 1
print(sorted[1])
# for i in sorted:
#     print(i, end=' ')