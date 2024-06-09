time=$( date +%H)
echo $time " : " $( date +%M) " : "  $( date +%S)

if [ $time -ge 0  -a  $time -lt 12 ]
 then
   echo "Good morning"
elif [ $time -ge 12  -a  $time -lt 16 ]
 then
  echo "Good afternoon"
elif [  $time -ge 16  -a   $time -lt 24 ]
 then
  echo "Good evening"
else
  echo "Good night"
fi

# time 
t=$( date +%T)
echo $t