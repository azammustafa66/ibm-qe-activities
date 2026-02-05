import pandas as pd

# Read the CSV file
df = pd.read_csv("users.csv")

# Print column names
print(df.columns)
print()

# 1. Print the values only in the usernames column
print("usernames column:")
print(df["usernames"])
print()

# 2. Print the username and password of the second row
print("Second row username and password:")
print("username:", df.loc[1, "usernames"])
print("Password:", df.loc[1, "Password"])
print()

# 3. Sort the usernames column in ascending order
print("Data sorted by usernames (Ascending):")
sorted_usernames = df.sort_values("usernames")
print(sorted_usernames)
print()

# 4. Sort the Password column in descending order
print("Data sorted by Password (Descending):")
sorted_passwords = df.sort_values("Password", ascending=False)
print(sorted_passwords)
