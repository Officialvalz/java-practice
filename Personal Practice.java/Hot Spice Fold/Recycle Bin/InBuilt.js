function even(){

    let result = [1, 2, 3, 4, 5]

        .filter(number => number % 2 === 0)

    console.log(result);

}

even();


function second(){

    let result = [1, 2, 3, 4, 5]

        .map(index => index * 2)

    console.log(result);

}
second();



function sumNumbers(){

    let numbers = [1, 2, 3, 4]

    let sum = numbers.reduce((accumulator, elements) => accumulator + elements, 0);

    console.log(sum);

}
sumNumbers();


function converter(){

    let strings = ["1", "2", "3"]

        .map(index => parseInt(index));

    console.log(strings);

}
converter();


function addTen(){

    let number_element = [0, 5, 10, 15]

        .map(index => index + 10)

    console.log(number_element)

}
addTen();

function convertTemperature(){

    let celicus = [0, 20, 37, 100]

        .map(celicus => celicus * 1.8 + 32)

console.log(celicus)

}

convertTemperature();


function filterNone(){

    list = [1, null, 3, null, 5]


    .filter(list => list !== null)

console.log(list)

}
filterNone();


function extractNumbers(){

    let numbers = [1, 3, 4, 6, 9, 12]

    .filter(numbers => numbers % 3 == 0)

console.log(numbers)
}
extractNumbers();



function positiveNumbers(){

   let numbers = [-2, -1, 0, 1, 2]

    .filter(numbers => numbers > 0)

console.log(numbers)
}
positiveNumbers();




function product(){

    let numbers = [2, 3, 4]

    .reduce(numbers => numbers * numbers)

console.log(numbers)
}
product();



function maximum(){

    let numbers = [3, 7, 2, 9, 1]

    let maxNumbers = numbers.reduce((accumulator, elements) => Math.max(accumulator, elements), numbers[0]);

console.log(maxNumbers)

}
maximum();

function concatenanateStrings(){

    strings = ["Hello"," ", "World"]

    .reduce(strings => strings + strings)

console.log(strings)
}
concatenanateStrings()




