# 'a', 'e', 'i', 'o', 'u'
while True:
    a = input()
    if a == '#':
        break
    a = a.lower()
    summ = a.count("a") + a.count("e") + a.count("i") + a.count("o") + a.count("u")
    print(summ)