colors = {'red', 'blue', 'black', 'red', 'white', 'green'}

print(colors)
print(len(colors))
print('purple' in colors)

for color in colors:
    print(color.upper(), end = " ")
print()

numbers = list(range(10)) + list(range(5))
print(numbers)

print(set(numbers))


text = "to be or not to be that is the question"

unique_text = set(text.split())

for word in sorted(unique_text):
    print(word, end = " ")
print()

#comparing SET
number1 = {1, 3, 5}

number2 = {3, 5, 1}

print(number1 == number2) 
print(number1 > number2) 
