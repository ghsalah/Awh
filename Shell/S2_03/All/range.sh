echo "Enter the file name:"
read f

echo "Enter the starting line:"
read s

echo "Enter the ending line:"
read e

sed -n $s,$e\p $f