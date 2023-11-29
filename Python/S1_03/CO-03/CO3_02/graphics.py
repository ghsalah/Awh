from graphics.circle import circleArea
from graphics.circle import circlePerimeter
r=int(input("Enter the radius : "))
circleArea(r)
circlePerimeter(r)

from graphics.rectangle import rectangleArea
from graphics.rectangle import rectanglePerimeter
l=int(input("Enter the length : "))
b=int(input("Enter the breadth : "))
rectangleArea(l,b)
rectanglePerimeter(l,b)

from graphics.Dgraphics.cuboid import cuboidArea
from graphics.Dgraphics.cuboid import cuboidPerimeter
l=int(input("Enter the length : "))
b=int(input("Enter the breadth : "))
h=int(input("Enter the height : "))
cuboidArea(l,b,h)
cuboidPerimeter(l,b,h)

from graphics.Dgraphics.sphere import sphereArea
from graphics.Dgraphics.sphere import spherePerimeter
r=int(input("Enter the radius : "))
sphereArea(r)
spherePerimeter(r)