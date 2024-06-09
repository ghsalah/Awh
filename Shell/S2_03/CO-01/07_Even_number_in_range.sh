echo "Enter the Limit "
read l
echo "the even numbers up to" $l
for (( i=0; i<=l; i++ ))
do
    if [ $((i%2)) -eq 0 ]
    then
        echo $i
    fi
done
