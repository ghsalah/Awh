opt=0
while [ $opt -le 7 ]
do
clear
echo " \n 1.all ordinary files \n2.all directory files \n3.all special files \n4. all files readable to UGO \n5.all files witable to UGO \n6.all files executable to UGO \n7.all files with read write execute to owner \n8.exit"
echo -n "option:"
read opt

case $opt  in

1)echo "\n ordinary files are:"
for file in *
do
if [ -f $file ]
then
echo $file
fi
done
;;

2)echo "\n directory files are:"
for file in *
do
if [ -d $file ]
then
echo $file
fi
done
;;

3)echo "\n special files are:"
for file in *
do
if [ ! -d $file -a ! -f $file ]
then
echo $file
fi
done
;;

4)echo "\n all files readable to UGO"
for file in *
do
if [ -f $file ]
then
user=`ls -l $file | cut -c 2-2`
group=`ls -l $file | cut -c 5-5`
owner=`ls -l $file | cut -c 8-8` 
if [ $user="r" -a $group="r" -a $owner="r" ]
then
echo $file
fi
fi
done 
;;

5)echo "\n files that are writtable  by UGO :\n"
for file in *
do
if [ -f file ]
then
user=`ls -l $file | cut -c 3-3`
group=`ls -l $file | cut -c 6-6`
owner=`ls -l $file | cut -c 9-9`
if [ $user="w" -a $group="w" -a $owner="w" ]
then
echo $file
fi
fi
done
;;

6)echo "files executable by UGO are:"
for file in *
do
if [ -f file ]
then
user=`ls -l $file | cut -c 4-4` 
group=`ls -l $file | cut -c 7-7`
owner=`ls -l $file | cut -c 10-10`
if [ $user="x" -a $group="x" -a $owner="x" ]
then
echo $file
fi
fi
done
;;

7)echo " files rwx by owner are:"
for file in *
do
if [ -f file ]
then
rwx=`ls -l $file | cut -c 2-4`
if [ $rwx="rwx" ]
then
echo $file
fi
fi
done
;;

8)echo " existing..."
exit 0
;;

esac
echo -n "enter to continue:"
read x
done
