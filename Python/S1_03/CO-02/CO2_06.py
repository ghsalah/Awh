string="desision"
count=0
for i in string:
    for j in string:
        if i==j:
            count+=1
    print(i,'-is' ,count,"-times")
    count=0