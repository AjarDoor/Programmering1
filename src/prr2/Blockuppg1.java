package prr2;

import java.util.Scanner;

public class Blockuppg1 {
	
	static Scanner input = new Scanner(System.in);

	public static String[] Block() {
		System.out.println("Write words using blank spaces to insert them into a different index");
		String temp = input.nextLine();
		String[] strarr = temp.split(" ");
		return strarr;
	}

}
