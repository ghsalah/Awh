string = input("Enter the word: ")
for i in string:
    for j in string:
        if j != i:
            print('$', end='')
        else:
            print(j, end='')
    print() 
