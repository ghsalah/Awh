int_list1=[5,6,2,8,3]
int_list2=[2,4,6,9,3,5]

print("___The lists___")
print(int_list1)
print(int_list2)

print("___The length___")
print(len(int_list1))
print(len(int_list2))
if len(int_list1)==len(int_list2):
    print("Both have same length ")
else :
    print("Both have different length ")
 
print("___The sum___") 
print(sum(int_list1))
print(sum(int_list2)) 

if sum(int_list1)==sum(int_list2):
    print("Both have same sum ")
else :
    print("Both have different sum  ")
 
print("___Commen numbers___")
for i in int_list1:
    if i in int_list2:
        print(i) 
    
    
      