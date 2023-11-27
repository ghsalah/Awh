square=lambda a:a**2
rectangle=lambda l,b:l*b
triangle=lambda b,h:0.5*b*h

a=int(input("Enter the sides size : "))
print("The area of the square is : " ,square(a))

l=int(input("Enter the l : "))
b=int(input("Enter the b : "))
print("The area of the rectangle is : " ,rectangle(l,b))

b=int(input("Enter the b : "))
h=int(input("Enter the h : "))
print("The area of the triangle is : " ,triangle(b,h))
