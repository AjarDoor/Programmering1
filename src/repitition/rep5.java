package repitition;

import java.util.Scanner;

public class rep5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		boolean exit = false;
		while (!exit) {
			int tal = input.nextInt();
			sum = sum + tal;
			if (tal == 0) {
				exit = true;
			}
		}
		input.close();
		System.out.println(sum);
	}

}
