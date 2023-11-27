fact = 1
number = int(input("Enter the number: "))

for i in range(1, number+1):
    fact = fact * i

print("The factorial of", number, "= ", fact)