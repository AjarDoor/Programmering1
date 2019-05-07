import java.util.Scanner;

public class Gissa_talet_ludde {

	static Scanner input = new Scanner(System.in);
	static int scorefactor = 0;
	static int tal;
	static int life = 0;
	static boolean win = false;
	static int score = 0;
	static int max = 0;
	static boolean nittio = false;
	static int guessmax = -1;
	static int guessmin = 151; 

	public static void main(String[] args) {

		for (int i = 0; i <= 1; i++) {
			if (i == 0) {
				System.out.println("Välkommen spelare, välj en svårighetsgrad för ditt antal liv (lätt = 8, medel = 5, svår = 3)");
				int difficulty = input.nextInt();
				tal = randomnum(difficulty);

			} else {
				System.out.println("Välj en svårighetsgrad för ditt tal (lätt = 0-50, medel = 0-100, svår = 0-150)");
				int difficulty = input.nextInt();
				lives(difficulty);

			}
			if (tal == -1) {
				System.out.println("Ta ett tal mellan 1 och 3 den här gången");
				i = -1;
			}
			if (tal == -2) {
				System.out.println("Ta ett tal mellan 1 och 3 den här gången");
				i = 0; 
			}
		}

		while (life > 0 && win == false) {
			int guess = input.nextInt();
			HigherLower(guess);

		}
	}

	public static int randomnum(int difficulty) {

		double random2 = (Math.random() * 50);
		int random = 1;

		if (difficulty == 1) {
			random = (int) random2 * 1;
			scorefactor += 0.5;
			max = 50;

		}
		if (difficulty == 2) {
			random = (int) random2 * 2;
			scorefactor += 0.8;
			max = 100;

		}
		if (difficulty == 3) {
			random = (int) random2 * 3;
			scorefactor += 1;
			max = 150;

		}
		if (difficulty > 3 || difficulty < 1) {
			random = -1;
		}
		return random;

	}

	public static void lives(int difficulty) {

		if (difficulty == 1) {
			life = 8;
			scorefactor += 0.5;

		}
		if (difficulty == 2) {
			life = 5;
			scorefactor += 0.8;

		}
		if (difficulty == 3) {
			life = 3;
			scorefactor += 1;

		}
		if (difficulty > 3 || difficulty < 1) {
			tal = -2;
		}

	}

	public static void HigherLower(int guess) {

		if (guess > max || guess < 0) {
			System.out.println("Gissa igen mellan 0 och " + max);

		} else if (guess == 90 && tal < 90) {
			nittio = true;
			life--;
			System.out.println("Mindre, du har " + life + " antal liv kvar");

		} else if (guess == 80 && tal > 80 && nittio == false) {
			life--;
			System.out.println("Talet är mellan 80 och max, du har " + life + " antal liv kvar");

		} else if (guess == 80 && tal > 80 && nittio == true) {
			life--;
			System.out.println("Talet är mellan 80 och 90, du har " + life + " antal liv kvar");

		} else if (guess < tal) {
			life--;
			score -= 100;
			System.out.println("Högre, du har " + life + " antal liv kvar");

		} else if (guess > tal) {
			life--;
			score -= 100;
			System.out.println("Mindre, du har " + life + " antal liv kvar");

		}
		if (guess == tal) {
			score = (score + 1000) * scorefactor;
			System.out.println("Du har rätt, du vinner! Ditt score blev: " + score);
			win = true;
			System.out.println(scorefactor);

		}
		if (life == 0) {
			System.out.println("Du förlorade... Talet var: " + tal + " och ditt score blev: " + score);
		}
		
		if (guess < guessmin && guess > -1) {
			guessmin = guess; 
			
		}
		else if (guess > guessmax && guess <= max) {
			guessmax = guess; 
			
		}

	}

}


