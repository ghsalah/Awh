text="one day or day one it is your desision"
textlist=text.split()
count=0
for i in textlist:
    for j in textlist:
        if i==j:
            count+=1
    print(i,'-is' ,count,"-times")
    count=0