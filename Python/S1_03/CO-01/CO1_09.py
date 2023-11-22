def swap(string):
    
    first = string[0]
    last = string[-1]
    middle = string[1:-1]
    new_string = last + middle + first
    return new_string

input_string = input("Enter the word: ")
print("The word is", input_string)
new_word = swap(input_string)
print("The new word is:", new_word)
