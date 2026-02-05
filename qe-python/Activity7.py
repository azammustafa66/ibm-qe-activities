
n = int(input("Enter number of elements: "))

numbers = []
total = 0

for i in range(n):
    num = int(input(f"Enter element {i+1}: "))
    numbers.append(num)
    total += num

print("List:", numbers)
print("Sum of all elements:", total)
