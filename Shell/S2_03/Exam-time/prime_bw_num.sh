echo "Enter the start number :"
read start
echo "Enter the end number :"
read end

echo "The prime numbers between $start and $end are:"

for (( num=start ; num<=end ; num++ ))
do
    is_prime=true
    
    for (( i=2; i*i<=num; i++ ))
    do
        if [ $((num % i)) -eq 0 ]
	then
            is_prime=false
            break
        fi
    done
    
    if $is_prime
    then
        echo $num
    fi
done

