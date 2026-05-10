const prompt = require("prompt-sync")();

let message = prompt("Enter message: ");
let shift = Number(prompt("Enter shift value: "));

let encrypted = "";

for (let i = 0; i < message.length; i++) {

    let letter = message[i];

    if (letter >= 'A' && letter <= 'Z') {

        let code = letter.charCodeAt(0);

        code = code + shift;

        if (code > 90) {
            code = code - 26;
        }

        encrypted += String.fromCharCode(code);
    }

    else if (letter >= 'a' && letter <= 'z') {

        let code = letter.charCodeAt(0);

        code = code + shift;

        if (code > 122) {
            code = code - 26;
        }

        encrypted += String.fromCharCode(code);
    }

    else {
        encrypted += letter;
    }
}

console.log("Encrypted message:", encrypted);