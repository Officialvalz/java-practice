const prompt = require("prompt-sync")();

let secretNumber = Math.floor(Math.random() * 10) + 1;

let guess = 0;

while (guess !== secretNumber) {

    guess = Number(prompt("Guess a number between 1 and 10: "));

    if (guess > secretNumber) {
        console.log("Too high");
    }

    else if (guess < secretNumber) {
        console.log("Too low");
    }

    else {
        console.log("Correct!");
    }
}