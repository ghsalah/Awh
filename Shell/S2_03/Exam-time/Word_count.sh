if [ $# -gt 1 ]
then
echo "stntax is <$0> [<filename>]"
exit 1
fi
flag=0
read -p "enter a file" filename
if [ $# -eq 1 ]
then
term="tty"
exec < "$1"
flag=1
fi
no1=0
nowds=0
while read line
do
no1=`expr $no1 + 1`
set $line>/dev/null
nowds=`expr $nowds + $#`
done < $filename
echo "no of lines=$no1"
echo "no of words=$nowds"
if (( $flag == 1 ))
then
 exec < "$term"
fi

exit 0
Comment
