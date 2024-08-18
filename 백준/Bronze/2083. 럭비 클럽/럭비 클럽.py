p = []
while True:
    n, a, w = map(str, input().split())
    a = int(a)
    w = int(w)
    if n == "#":
        break
    print(n, end = " ")
    if a > 17 or w >= 80:
        print("Senior")
    else:
        print("Junior")