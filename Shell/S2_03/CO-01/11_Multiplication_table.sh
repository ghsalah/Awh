echo "Enter the Number : "
read num
i=1
while [ $i -le 10 ]
do
	mul=$((num*i))
	echo $i " x " $num "=" $mul
	((i++))
done
