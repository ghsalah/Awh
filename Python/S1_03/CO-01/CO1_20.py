original_list = []
filtered_list = []

for i in range(1, 11):
    original_list.append(i)

print("Original List:", original_list)

for num in original_list:
    if num % 2 != 0:
        filtered_list.append(num)

print("Filtered List:", filtered_list)
