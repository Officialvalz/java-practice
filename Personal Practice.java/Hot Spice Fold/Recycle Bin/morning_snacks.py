from functools import reduce

numbers = [1, 2, 3, 4, 5]

def square_number_using_map(numbers):

    return numbers ** 2

map_square = list(map(square_number_using_map, numbers))

print(map_square)



words = ["apple", "banana", "cherry"]

def list_converter(word):

    result = len(word)

    return result

words_length = list(map(list_converter,words))



list_of_number = [1, 2, 3, 4, 5, 6]

def even_numbers(list_of_numbers):

    return list_of_numbers % 2 == 0

square_of_numbers = list(filter(even_numbers, list_of_number))

print(square_of_numbers)




sample_words = ["apple", "banana", "kiwi", "grapes", "cherry"]

def characters_above_five(list_of_letters):
    
    return len(list_of_letters) > 5;

greater = list(filter(characters_above_five, sample_words))

print(greater)
    



list_string_words = ["I", "Love", "Python", "Snacks"]

def string_with_hypen(accumulator, elemenator):

    return accumulator + "-" + elemenator

print(reduce(string_with_hypen, list_string_words))



number_strings = ["1", "2", "3"]
def convert_list_to_int(converter):

    return int(converter)

return_result = list(map(convert_list_to_int, number_strings))
print(return_result)



add_element = [0, 5, 10, 15]
def add_ten(elements):

    return elements + 10

element_result = list(map(add_ten, add_element))
print(element_result)



calcius_list = [0, 20, 37, 100]
def celcius_fahrenheit(index):
    return (index * 1.8 + 32)

fahrenheit_result = list(map(celcius_fahrenheit,calcius_list))
print(fahrenheit_result)



none_value_list = [1, None, 3, None, 5]
def remove_none(none_values):

    if none_values != int:
        return none_values

none_value_result = list(filter(remove_none, none_value_list))

print(none_value_result)



divisible_list = [1, 3, 4, 6, 9, 12]
def divisible_number(extract):

    return extract % 3 == 0

divisible_result = list(filter(divisible_number, divisible_list))

print(divisible_result)




positive_list = [-2, -1, 0, 1, 2]

def remove_none_positive_numbers(positive_numbers):
    if positive_numbers >  0:
        return positive_numbers

positive_result = list(filter(remove_none_positive_numbers, positive_list))
print(positive_result)



product_numbers = [2, 3, 4]

def product_of_all_numbers(accumulator, elements):
    
    return accumulator * elements

print(reduce(product_of_all_numbers, product_numbers))



maximum_list = [3, 7, 2, 9, 1]

def find_maximum(accumulator, elements):
  
    return max(accumulator, elements)

print(reduce(find_maximum, maximum_list))




all_strings = ["Hello", " ", "World"]

def concatenate(accumulator, elements):

    return accumulator + elements

print(reduce(concatenate, all_strings))
