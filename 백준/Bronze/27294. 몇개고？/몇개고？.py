h, s = map(int, input().split())
rice = 280 if s or not 12 <= h <= 16 else 320
print(rice)