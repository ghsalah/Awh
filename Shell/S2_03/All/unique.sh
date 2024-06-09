echo "Enter the file name:"
read filename


if [ -f "$filename" ];
then
    count=$(cat "$filename" | tr -s '[:space:]' '\n' | sort | uniq -c | wc -l)

    echo "Total unique words: $count"

else
    echo "File not found."
fi
