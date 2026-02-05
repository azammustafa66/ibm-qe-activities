n = (int)(input("Enter the number of elements : "))

number = []
for i in range(n):
    num = int(input(f"Enter element {i+1}: "))
    number.append(num)

if number[0] == number[-1]:
    print("First and last elements are SAME")
else:
    print("First and last elements are NOT SAME")