x = input().split()

a = int(x[0])
b = int(x[1])

sum_val = 0


if a < b :
    for i in range (a, b+1):
        if i % 5 == 0 :
            sum_val += i
elif a >= b : 
    for i in range (b, a+1):
        if i % 5 == 0 :
            sum_val += i

print(sum_val)