# Input first list
list1 = list(map(int, input("Enter elements of first list: ").split()))
# Input second list
list2 = list(map(int, input("Enter elements of second list: ").split()))

# Create new list: odd from list1 + even from list2
new_list = [x for x in list1 if x % 2 != 0] + [y for y in list2 if y % 2 == 0]

print("New list:", new_list)
