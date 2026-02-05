import pandas as pd

# Read the Excel file
df = pd.read_excel("activity19.xlsx")

# 1. Print number of rows and columns
rows, columns = df.shape
print("Number of rows:", rows)
print("Number of columns:", columns)
print()

# 2. Print only the Email column
print("Email column data:")
print(df["Email"])
print()

# 3. Sort data based on FirstName in ascending order
sorted_df = df.sort_values("FirstName")

print("Data sorted by FirstName (Ascending):")
print(sorted_df)
