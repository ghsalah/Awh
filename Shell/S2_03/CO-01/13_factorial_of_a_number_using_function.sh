fact()
{
 n=$1
 i=1
 f=1
 while [ $i -le $n ] 
 do
	 f=$((f * i))
	 ((++i))
 done
 echo "$n! = $f"

}

echo "Enter the number"
read a
fact $a
