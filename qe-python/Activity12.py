print("Function to calculate the sum of numbers from zero to n")

n = int(input())

def sum_n(n):
    if n <= 1:
        return n
    else:
        return n + sum_n(n - 1)

result = sum_n(n)
print(result)
