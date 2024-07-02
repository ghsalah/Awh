echo "Enter the 1st "
read a
echo "Enter the 2nd "
read b
echo "Enter the 3rd "
read c

if [ $a -gt $b ] 
then
	s1=$b
	if [ $a -gt $c ]
	then
		 s2=$c
		 b1=$a
	else
		 s2=$a
                 b1=$c
	fi
else

	s1=$a
        if [ $b -gt $c ]
        then
                 s2=$c
                 b1=$b
        else
                 s2=$b
                 b1=$c
        fi

fi

echo "$a $b $c"
echo "$s1 $s2 $b1"

if [ $(( s1 + s2 )) -gt $b1 ]
then
	echo " we can make triangle with $s1 ,$s2 and $b1"
else
	echo "  we can't make triangle with $s1 ,$s2 and $b1 "
fi
