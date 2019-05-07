import java.util.Scanner;

public class gissa_talet {
	static boolean haswon = false;
	static int lives = 10;
	static boolean replay = true;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		while (replay != false) {
			
			System.out.println("Gissa talet mellan 0 och 40");
			
			int num = randomnum();
			
			while (haswon != true || lives != 0) {
				
				int guess = input.nextInt();
				
				checkguess(guess, num);
			}

		}
	}

	public static int randomnum() {
		
		double placeholder = Math.random();
		placeholder = placeholder * 40 + 1;
		
		int num = (int) placeholder;
		
		return num;
	}

	private static void checkguess(int guess, int num) {

		if (guess == num) {
			
			haswon = true;
			
		} else if (num < guess) {
			
			lives--;
			if (lives != 0) {
				System.out.println("Talet är lägre än ditt gissning, du har nu " + lives + " liv kvar.");
				
				return;
				}
			
		} else {
			
			lives--;
			if (lives != 0) {
				System.out.println("Talet är högre än ditt gissning, du har nu " + lives + " liv kvar.");
				
				return;
				}
		}
		if (lives == 0) {
			System.out.println("Du har förlorat, vill du spela igen? [Y] eller [N]");
		}
		if (haswon = true) {
			System.out.println("Du vinner! Du fick " + lives * 2 + " poäng, vill du spela igen? [Y] eller [N]");
		}
		
		String cont = input.next();
		
		if (cont.equals("Y")) {
			
			replay = true;
			lives = 10;
		} else if (cont.equals("N")) {
			
			replay = false;
		}

	}

}
