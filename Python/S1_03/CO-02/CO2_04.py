import math
result_list = []
for num in range(1000, 10000):
    if num%2==0:
         square_root = int(math.sqrt(num))
         print(square_root)
         if int(square_root) ** 2 == num:
            result_list.append(num)

print("List of perfect squares:", result_list)
