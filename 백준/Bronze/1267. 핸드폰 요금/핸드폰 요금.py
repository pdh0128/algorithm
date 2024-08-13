n = int(input())
tell = list(map(int, input().split()))
if len(tell) != n:
    print("ERROR!!!")
    exit()

dudtlr_price = alstlr_price = 0
for seconds in tell: 
    dudtlr_price += (seconds // 30 + 1) * 10
    alstlr_price += (seconds // 60 + 1) * 15
if dudtlr_price < alstlr_price:
    print("Y", dudtlr_price)
elif alstlr_price < dudtlr_price:
    print("M", alstlr_price)
else:
    print("Y M", dudtlr_price)