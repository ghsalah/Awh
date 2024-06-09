echo "Enter sides of triangle:"
read a
read b
read c
if ((a+b > c && a+c > b && b+c > a))
then
echo "These sides can form triangle"
else
echo "These sides cannot form triangle"
fi
