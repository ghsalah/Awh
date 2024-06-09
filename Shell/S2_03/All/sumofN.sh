echo "Enter the llimit:"
read n
sum=0
echo "The sum of $n natural numbers are:"
for (( i=0; i<=n; i++ ))
 do
  sum=$(( sum + i ))
 done
echo "$sum"