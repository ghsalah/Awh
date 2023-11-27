words = ['hello', 'hi', 'hola', 'oi']
longest = 0
for word in words:
    if len(word) > longest:
        longest = len(word)
print("Length of longest word is",longest)
