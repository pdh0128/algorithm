import sys

input = sys.stdin.read
data = input().split()

n = int(data[0])
m = int(data[1])

share = n // m
remainder = n % m

print(share)
print(remainder)
