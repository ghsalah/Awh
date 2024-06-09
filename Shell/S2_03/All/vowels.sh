echo "Enter a sentence"
read string
vowels=$(echo "$string" | tr -cd 'aeiouAEIOU' | wc -m)
consonants=$(echo "$string" | tr -cd 'bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ' | wc -m)

echo "Vowels: $vowels"
echo "Consonants: $consonants"