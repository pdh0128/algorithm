for _ in range(3):
    sum = 0
    n = int(input())
    for _ in range(n):
        sum += int(input())
    if sum > 0:
        print("+")
    elif sum < 0:
        print("-")
    else:
        print(0)