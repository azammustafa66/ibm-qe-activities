import pandas as pd

# Create the data
data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": [
        "satviks@example.com",
        "avinashk@example.com",
        "lahri.rath@example.com"
    ],
    "PhoneNumber": [4537829158, 5892184058, 4528727830]
}

# Create DataFrame
df = pd.DataFrame(data)

# Write to Excel file
df.to_excel("activity19.xlsx", index=False)

print("Excel file created successfully!")