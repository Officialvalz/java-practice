score = int(input("Enter student score: "))

if score >= 70 and score <= 100:
    print("Grade: A")

elif score >= 60 and score <= 69:
    print("Grade: B")

elif score >= 50 and score <= 59:
    print("Grade: C")

elif score >= 45 and score <= 49:
    print("Grade: D")

elif score >= 0 and score <= 44:
    print("Grade: F")

else:
    print("Invalid score")