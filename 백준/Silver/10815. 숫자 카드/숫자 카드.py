N = int(input())
result = []
MyCard = []
Card = []
MyCard = set(map(int, input().split()))

if (len(MyCard) != N):
    print("Error")
    exit()

M = int(input())

Card = list(map(int, input().split()))
if (len(Card) != M):
    print("Error")
    exit()
    
for item in Card:
    if item in MyCard:
        result.append("1")
    else:
        result.append("0")
print(" ".join(result))