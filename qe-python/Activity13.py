
def sum_elements(lst, index=0):
    if index == len(lst):   
        return 0
    return lst[index] + sum_elements(lst, index + 1)

numbers = [1, 2, 3, 4, 5, 6]
print("Sum of elements:", sum_elements(numbers))