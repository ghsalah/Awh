n_list = []
c_list = []

for i in range(5):
    element = int(input("Enter the element: "))
    n_list.append(element)

print(n_list)

for element in n_list:
    if element <= 100:
        c_list.append(element)
    else:
        c_list.append("OVER")

print(c_list)
