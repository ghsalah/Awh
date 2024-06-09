echo enter file name
read file
echo enter word
read word
echo the line before removing word $word;
cat $file
grep -v -i $word $file > test
mv test $file
echo file after removing the word $word;
cat $file