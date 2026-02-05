

def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        return "Error"
    return a / b



def run_tests():
    tests = [
        ("Addition", add(10, 5), 15),
        ("Subtraction", subtract(10, 5), 5),
        ("Multiplication", multiply(4, 5), 20),
        ("Division", divide(10, 0), 2),
        ("Division by zero", divide(10, 0), "Error")
    ]

    for test_name, actual, expected in tests:
        if actual == expected:
            print(f"{test_name} : PASS")
        else:
            print(f"{test_name} : FAIL | Expected {expected}, Got {actual}")



run_tests()
