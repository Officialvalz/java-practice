const prompt = require("prompt-sync")();

let score = Number(prompt("Enter student score: "));

if (score >= 70 && score <= 100) {
    console.log("Grade: A");
}

else if (score >= 60 && score <= 69) {
    console.log("Grade: B");
}

else if (score >= 50 && score <= 59) {
    console.log("Grade: C");
}

else if (score >= 45 && score <= 49) {
    console.log("Grade: D");
}

else if (score >= 0 && score <= 44) {
    console.log("Grade: F");
}

else {
    console.log("Invalid score");
}