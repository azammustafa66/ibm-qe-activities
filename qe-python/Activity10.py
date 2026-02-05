# Input tuple from user
numbers = tuple(map(int, input("Enter numbers separated by space: ").split()))

print("\nNumbers divisible by 5:")

# Iterate through the tuple
for num in numbers:
    if num % 5 == 0:
        print(num, end=" ")

print()  # for newline at the end
