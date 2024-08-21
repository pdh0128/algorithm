arr = input()
arr = list(arr)
arr.reverse()
print(str(arr).replace("'", "").replace(" ", "").replace(",", "").strip(" []"))