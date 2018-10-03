package repitition;

import java.util.Scanner;

public class rep4 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			int sum = tal * i;
			System.out.println(tal + " gånger " + i + " är lika med " + sum);

		}
		input.close();
	}

}
