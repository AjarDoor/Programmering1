package repitition;

import java.util.Scanner;

public class rep4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input tal mellan 1-10 f�r att f� dess g�ngertabell");
		int tal = input.nextInt();

		if (tal > 0 && tal <= 10) {
			for (int i = 1; i != 11; i++) {
				System.out.println(tal + " g�nger " + i + " �r lika med " + tal * i);
			}
		} else {
			input.close();
		}
		input.close();
	}

}
