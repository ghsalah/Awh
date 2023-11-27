string=input("Enter a string : ")
print(string[-3:])
if string[-3:]=="ing":
    print(string+"ly")
else:
    print(string+"ing")