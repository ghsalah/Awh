dict1 = {1: "hi", 2: "how", 3: "are", 4: "you"}
dict2 = {1: "hello", 2: "how", 3: "you", 4: "doing"}

dict3 = {}
for i in range(1, len(dict1) + 1):
    dict3[i] = dict1[i]

for i in range(len(dict1) + 1, len(dict1) + len(dict2) + 1):
    dict3[i] = dict2[i - len(dict1)]

print("Dictionary1:", dict1, "\nDictionary2:", dict2, "\nMerge Dictionary:", dict3)
