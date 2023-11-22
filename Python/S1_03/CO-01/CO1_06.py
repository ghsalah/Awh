list=['salah','akash','abhinad','athul','dhanish']
count=0
for i in list:
    for j in i:
        if j=='a':
            count+=1
    print(i,'have' ,count,"times a in it")
    count=0