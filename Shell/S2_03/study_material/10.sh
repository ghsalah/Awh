echo "\n\n Directory of `pwd` \n"

for f in *
do
#dpart=`ls -l $f | cut -d ' ' -f6,7`
fdatetime=`date -r $f "+%d-%m-%y %H:%M:%S"`

if [ -d $f ]
then
echo "$f \t\t<DIR>\t\t $fdatetime"
else
f_size=`cat $f | wc -c`
echo "$f \t\t $f_size \t $fdatetime"
fi
done
