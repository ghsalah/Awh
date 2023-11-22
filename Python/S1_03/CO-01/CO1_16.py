def swap(string1, string2):
    first1 = string1[0]
    first2 = string2[0]
    middle1 = string1[1:]
    middle2 = string2[1:]
    new_string = first2 + middle1+" "+first1 + middle2
    return new_string

sinput1 = input("Enter the 1st string: ")
sinput2 = input("Enter the 2nd string: ")

new_string = swap(sinput1, sinput2)
print("The new string is:", new_string)
