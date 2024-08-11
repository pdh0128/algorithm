from fractions import Fraction
(a1, b1) = map(int, input().split())
(a2, b2) = map(int, input().split())
sumi = Fraction(a1, b1) + Fraction(a2, b2)
print(sumi.numerator, sumi.denominator)