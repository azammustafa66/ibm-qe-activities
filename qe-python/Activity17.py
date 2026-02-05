import pandas as pd

data = {
    "usernames": ["admin", "Charles", "Deku"],
    "Password" : ["password", "Charli3", "AllMight"]
}

df = pd.DataFrame(data)
df.to_csv("users.csv", index = False)
print("CSV file 'users.csv', created successfully!")
