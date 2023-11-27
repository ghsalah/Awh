num = int(input("Enter the number of Fibonacci numbers to generate: "))

a = 0
b = 1
fibonacci_sequence = [a]

for i in range(1, num):
    a, b = b, a + b
    fibonacci_sequence.append(a)

print(fibonacci_sequence)
