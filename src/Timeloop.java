import java.util.Scanner;

public class Timeloop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		// Skriver ut 1-num
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " Abracadabra");
		}

	}
}
