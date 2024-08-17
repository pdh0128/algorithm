S = input().strip()

current_char = S[0]

zero_blocks = 0
one_blocks = 0

for char in S:
    if char != current_char:
        if current_char == '0':
            zero_blocks += 1
        else:
            one_blocks += 1
        current_char = char
if current_char == '0':
    zero_blocks += 1
else:
    one_blocks += 1
mini = min(zero_blocks, one_blocks)
print(mini)
