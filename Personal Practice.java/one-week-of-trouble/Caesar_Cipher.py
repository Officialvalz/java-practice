message = input("Enter message: ")
shift = int(input("Enter shift value: "))

encrypted = ""

for letter in message:

    if letter.isupper():

        code = ord(letter)

        code = code + shift

        if code > 90:
            code = code - 26

        encrypted += chr(code)

    elif letter.islower():

        code = ord(letter)

        code = code + shift

        if code > 122:
            code = code - 26

        encrypted += chr(code)

    else:
        encrypted += letter

print("Encrypted message:", encrypted)