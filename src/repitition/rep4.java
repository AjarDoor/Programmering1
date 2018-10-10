package repitition;

import java.util.Scanner;

public class rep4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input tal mellan 1-10 för att få dess gångertabell");
		int tal = input.nextInt();

		if (tal > 0 && tal <= 10) {
			for (int i = 1; i != 11; i++) {
				System.out.println(tal + " gånger " + i + " är lika med " + tal * i);
			}
		} else {
			input.close();
		}
		input.close();
	}

}
