package prr2;

import java.util.Scanner;

public class repuppg1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		sum();
		reverse(input.nextLine());
		Blockuppg1.Block();
	}

	public static int sum() {

		System.out.println("Input '0' when done");
		boolean exit = false;
		int summa = 0;
		while (!exit) {
			int num = input.nextInt();
			if (num == 0) {
				exit = true;
			} else {
				summa += num;
			}
		}
		System.out.println("Summan av alla tal är " + summa);
		return summa;
	}

	public static String reverse(String string) {

		System.out.println("Input a word and have it reversed");
		string = input.nextLine();
		int length = string.length() - 1;
		String reversed = "";

		for (int i = 0; i < string.length(); i++) {
			reversed += string.charAt(length);
			length--;
		}

		System.out.println(reversed);
		return reversed;
	}

	

}
