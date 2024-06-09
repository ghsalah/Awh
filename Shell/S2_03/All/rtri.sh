echo "Enter first number:"
read a
echo "Enter second number:"
read b
echo "Enter third number:"
read c
if ((a+b > c  && a+c > b && b+c > a))
then
if [[ $((a*a)) -eq $((b*b + c*c)) || $((b*b)) -eq $((a*a + b*b)) || $((c*c)) -eq $((a*a + b*b)) ]]
then
echo "Can form right angle triangle"
else
echo "Cannot form right angle triangle"
fi
else
echo "Cannot form triangle"
fi
