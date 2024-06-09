echo "Enter the first side"
read a
echo "Enter the second side"
read b
echo "Enter the third side"
read c
if [ $a == $b -a $a == $c -a $b == $c ]
then
  echo "Triangle is Equilateral"
elif [ $a == $b -o $a == $c -a $b != $c ]
then
  echo "Triangle is Isoselece"
else
  echo "Triangle is Scalence"
fi
