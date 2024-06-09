echo "Enter the Range "
read r
for ((i=0 ;i<=r;i++))
do
	sum=$((sum + i))
done
echo "Sum is : " $sum 
