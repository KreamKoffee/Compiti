n = 11
while True:
    a = n
    for i in range(4):
        a = a-((a+1)/(i+2))
        print(a)
    if a == 11:
        print(n)
        break
    n+=1