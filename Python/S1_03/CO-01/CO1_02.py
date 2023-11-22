current_year = 2023
year_list=[]
end_year = int(input("Enter the End year: "))
print("Leap years from ",current_year,"to", end_year)
while current_year <= end_year:
    if current_year % 4 == 0:
        year_list.append(current_year)
    current_year += 1
    
print(year_list)