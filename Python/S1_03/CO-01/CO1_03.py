print("LIST COMPREHENSIONS \na")
integers = [-5, -4, 3, 2, 1]
positive = [i for i in integers if i > 0]
print(positive)

print("b")
num = int(input("Enter your number: "))
print("The list of squares:")
n_list = [i**2 for i in range(1, num+1)]
print(n_list)

print("c")
vowels = ["a", "e", "i", "o", "u"]
word = input("Enter the word: ")
word_list = list(word)
w_vowels = [char for char in word_list if char in vowels]
print(w_vowels)

print("d")
new_word = input("Enter the word: ")
new_word_list = list(new_word)
ord_list = [ord(word) for word in new_word_list]
print(ord_list)
