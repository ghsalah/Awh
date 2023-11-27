string = input("Enter the word: ")

replaced_chars = {}

for i in string:
    if i in replaced_chars:
        print('$', end='')
    else:
        replaced_chars[i] = True
        print(i, end='')

print()
