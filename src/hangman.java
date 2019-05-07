import hangman.HangmanConsoleWindow;

/**
 * 
 * @author Sebastian Kosmela
 * @version Final
 */
public class hangman {
	static HangmanConsoleWindow console = new HangmanConsoleWindow();
	static int lives;
	static int liveslost;
	static boolean haswon;
	static boolean replay = true;
	static String temp;
	static char[] ordattgissa;
	static String displaytemp;
	static char[] display;
	static String gissning;
	static char[] guess;
	static String guessed;

	/**
	 * Declaration of variables
	 * @param args Main method that runs the program.
	 */
	public static void main(String[] args) {

		while (replay) {
			console.println("Write the word that will save\nthe questionably innocent man!");
			start();
			console.println(
					"Start guessing letters, \nyou have " + lives + " guesses to save \nthe questionably innocent man");
			while (lives != 0) {
				checkguess();
				if (haswon == true) {
					console.clear();
					console.println("You won!");
					break;
				}

			}
			/**
			 * Loops while you still have lives remaining
			 */
			playagain();
		
			console.clear();
		}
		/**
		 * Will continue to reset and run the program while replay is true
		 */
	}

	public static void start() {
		temp = console.nextString();
		ordattgissa = temp.toCharArray();
		displaytemp = "";
		for (int i = 0; i < temp.length(); i++) {
			displaytemp += "_";
		}
		/**
		 * Sets the display (which is what the player sees as their progress)
		 * to an amount of blanks equal to the length of the word that has to be guessed.
		 * For example if the word is hi the display will start with two blanks (__).
		 */
		display = displaytemp.toCharArray();
		replay = false;
		haswon = false;
		lives = 9;
		liveslost = 0;
		console.clear();
		guessed = "";
	}
	/**
	 * Runs at the start of the program to reset all values to default and receive a new word
	 */

	private static void checkguess() {

		console.println();
		gissning = console.nextString();
		console.println();
		console.clear();
		/**
		 * Receives a character that it will use as the guess and then clears the console
		 * before moving on and comparing the guess.
		 * The guess will reset every time this method is started so that 
		 * it wont get stuck in a loop checking the same guess.
		 */

		boolean correctguess = false;

		guess = gissning.toCharArray();
		while (guess.length > 1 || guessed.contains(guess + "")) {
			console.println("Please input a single character that has not already been used");
			gissning = console.nextString();
			guess = gissning.toCharArray();
			console.clear();
		}
		/**
		 * Checks to make sure you are not guessing the same character twice
		 */
		for (int i = 0; i < ordattgissa.length; i++) {

			if (ordattgissa[i] == guess[0]) {

				display[i] = ordattgissa[i];
				correctguess = true;

			}
			/**
			 * Checks if your guess is contained within the word you have to guess.
			 * If it is contained the program will set a boolean to true 
			 * which prevents you from losing a life (as you have not guessed incorrectly).
			 */

		}
		/**
		 * This loop will fill out the blanks in the display to match your correct guesses.
		 * For example, if the display is hello and l is guessed the display will change
		 * from _____ to __ll_
		 * This also serves to check if you have won or not, if all the blanks are gone
		 * and the display is the same as the word you have to guess you have won.
		 */
		for (int a = 0; a < display.length; a++) {
			console.print("" + display[a]);
		}
		/**
		 * Prints out the display after every guess so you can see your progress.
		 */
		console.println();
		if (correctguess == false) {
			if (guessed.contains(new String(guess))) {
				guessedchars();
				console.clear();
			}else {
				if(!guessed.contains(new String(guess))) {
				console.println("Wrong guess");
				lives--;
				liveslost++;
				lostalife();
				}
			}
		}
		/**
		 * Determines whether you should lose a life or not
		 * based on if you are guessing a already guessed character
		 * (Returns to the check that prevents you from inputting the same character)
		 * or guess wrong and the character has not been guessed already (Lose a life)
		 */
		guessedchars();
		boolean fail = false;
		for (int n = 0; n < ordattgissa.length; n++) {
			if (ordattgissa[n] != display[n]) {
				fail = true;
			}
		}
		/**
		 * Here it compares what you have guessed with the word,
		 * if it is not equal (for example, if the word is hi and your display is h_)
		 * then it will set fail to true and you will continue playing
		 */
		if (!fail) {
			haswon = true;
		}

	}
	/**
	 * This entire method receives a input and reads the first character of it
	 * (to prevent guessing entire strings)
	 * and checks it with the word that has to be guessed.
	 * If the character you guessed is not found anywhere in the correct word,
	 * you will lose a life and have to guess again
	 */
	
	private static void guessedchars() {
		
		if (!guessed.contains(new String(guess))) {
			guessed += " " + new String(guess);
		} else {
			console.println("Input a character \nthat has not been guessed");
		}
		if(guessed.length()%5 == 0) {
			guessed += "\n";
		}
		console.println("You have guessed: " + guessed.toString());

	}
	/**
	 * This method keeps track of what characters you have guessed and prints them out to you.
	 * This is to help players keep track of their options and it helps prevent losing lives
	 * by guessing the same wrong character twice.
	 */

	public static void playagain() {
		console.println("Do you want to play again? \nY (Yes) or N (No)");
		char control = console.nextChar();
		if (control == 'Y' || control == 'y') {
			replay = true;
		} else if (control == 'N' || control == 'n') {
			replay = false;
		}

	}
	/**
	 * At the end of the game, whether you won or lost,
	 * this method will ask if you want to play again.
	 * If you answer Y/y it will replay from the start,
	 * resetting all the values and asking for a new word to guess.
	 * If you answer N/n or anything else it will not replay and the program will stop.
	 */

	private static void lostalife() {
		if (liveslost > 0) {
			console.println(" ------ ");
		}
		if (liveslost > 1) {
			console.println("|     |");
		}
		if (liveslost > 2) {
			console.println("|     |");
		}
		if (liveslost > 3) {
			console.println("|     |");
		}
		if (liveslost > 4) {
			console.println("|     |");
		}
		if (liveslost > 5) {
			console.println("|     O");
		}
		if (liveslost > 6) {
			console.println("|    /|\\");
		}
		if (liveslost > 7) {
			console.println("|    / \\");
		}
		if (liveslost > 8) {
			console.println("|       ");
			console.println("You got hanged");
		}

	}
	/**
	 * This method gradually prints out more and more of the hangman as your lives decrease.
	 * It does this by tracking how many lives you have lost and using that to
	 * determine how much of the hanging it will show you.
	 * When you run out of lives it will display the fully hanged man as you have lost.
	 */

}
