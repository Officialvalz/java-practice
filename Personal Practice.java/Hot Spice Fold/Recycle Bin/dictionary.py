#user_input = {'1' : name, '2' : lastname, '3' : age, '4' : classs}
#
#print(user_input['2'])
#
#
#.items is a dictionary method that returns each key-value pair as tuple

#Methods in dictionary
#.items()
#.value()
#.key() - use to iterate through a dictionary keys and values, same as items and values
#del
#.pop
#.get

days_per_month = {'Jan' : 31, 'Feb' : 28, 'March' : 31}

#
#
#for month, days in days_per_month.items():
#
#    print(f"{month} and its days {days}")
#
#print(days_per_month['Feb'])
#
#days_per_month['March'] = 10
#
#del days_per_month['Feb']
#
#days_per_month.pop('Jan')
#
#print(days_per_month)
#
#print(days_per_month.get('April', 'Not in the dicationary'))
#
#print(days_per_month.get('March'))
#
#boolean, checks if a key is in the list and returns true or false
#print('Feb' in days_per_month)


#days_per_month = days_per_month.keys()
#
#for keys in days_per_month:
#    print(keys, end = " ")

#
#Convert the dictionart keys to a list
print(list(days_per_month.keys()))
print(list(days_per_month.values()))
print(list(days_per_month.items()))

#sorting keys, or processing keys in sorted method
for month_name in sorted(days_per_month.keys()):
    print(month_name, end = " ")
#)
#
#DICTIONARY COMPARISION == AND != Is used to check if two dictionary has identical or different content

days_month = {'Jan' : 31, 'Feb' : 28, 'March' : 31}
months = {'Jan' : 31, 'Feb' : 28, 'March' : 31}

print(days_month.update(months))

print(days_month != months)







#Using a dictionar to rep an instructors grade book

grade_book = {
      'Susan' : [98, 60, 90],
       'Mich' : [12, 34, 5],
       'Azizi' : [56,7, 9],
       'pantipa' : [78, 4, 55]
            }



all_grade_total = 0
all_grade_count = 0

for name, grades in grade_book.items():
    total = sum(grades)
    print(f"Average for {name} is {total/len(grades):.2f}")
    all_grade_total += total
    all_grade_count += len(grades)
print(f"Class's average is: {all_grade_total / all_grade_count:.2f}'")


















#import math
#
#def miles():
#
#    result = 0
#
#    enter_mile = float(input("Enter mile: "))
#
#    result = enter_mile * 1.6;
#
#    print(result)
#
#miles()
#
#def length_side():
#
#    length = int(input("Enter length of side: "))
#
#    length_result = length * length
#
#    area = math.sqrt(3) / 4 * length_result
#
#    print(area) 
#
#length_side()
#
#
#def length_area():
#
#    area = int(input("Enter length of side: "))
#
#    length = int(input("Enter length of side: "))
#
#    volume = area * length
#
#    print(volume) 
#
#length_area()
