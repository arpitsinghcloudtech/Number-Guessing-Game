let secretNumber;
let attempts = 0;

function newGame() {

    secretNumber = Math.floor(Math.random() * 100) + 1;

    attempts = 0;

    document.getElementById("message").textContent =
        "Enter your guess to start!";

    document.getElementById("attempts").textContent =
        "Attempts: 0";

    document.getElementById("guessInput").value = "";
}

function checkGuess() {

    const input = document.getElementById("guessInput");

    const guess = Number(input.value);

    const message = document.getElementById("message");

    if (!guess || guess < 1 || guess > 100) {

        message.textContent =
            "Please enter a number between 1 and 100.";

        return;
    }

    attempts++;

    document.getElementById("attempts").textContent =
        "Attempts: " + attempts;

    if (guess < secretNumber) {

        message.textContent =
            "📉 Too low! Try again.";

    } else if (guess > secretNumber) {

        message.textContent =
            "📈 Too high! Try again.";

    } else {

        message.textContent =
            "🎉 Correct! You guessed it!";

        alert(
            "Congratulations! You guessed the number in "
            + attempts
            + " attempts!"
        );
    }

    input.value = "";
    input.focus();
}

// Start the game when the page loads
newGame();