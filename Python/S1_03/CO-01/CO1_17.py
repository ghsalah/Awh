dictionary = {1: "hi", 2: "how", 3: "are", 4: "you"}
print("Dictionary:", dictionary)

reversed_dictionary = {}
l = len(dictionary)

for i in range(1, l + 1):
    reversed_dictionary[i] = dictionary[l-i+1]

print("Reversed Dictionary:", reversed_dictionary)
