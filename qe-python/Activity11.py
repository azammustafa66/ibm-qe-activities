# Create a dictionary of fruits and their prices
fruits_prices = {
    "apple": 100,
    "banana": 40,
    "mango": 120,
    "orange": 80,
    "grapes": 150
}

# Input fruit to check
fruit_to_check = input("Enter the name of the fruit to check: ").lower()

# Check availability
if fruit_to_check in fruits_prices:
    print(f"{fruit_to_check.capitalize()} is available at price: ₹{fruits_prices[fruit_to_check]}")
else:
    print(f"Sorry, {fruit_to_check.capitalize()} is not available.")

