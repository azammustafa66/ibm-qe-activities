from datetime import date

name = input("Enter the name : ")
age = input("Enter the age : ")
age = int(age)

current_year = date.today().year
print(current_year)
fut_age = 100-age
print(fut_age)
fut_year = current_year + fut_age
print(fut_year)

# print("You will turn 100 years in {fut_year}")