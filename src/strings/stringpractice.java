package strings;

import java.util.Scanner;

public class stringpractice {
	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
//		double radius = Input.nextDouble();
//		System.out.println("radien �r " + vol(radius));
//		System.out.println("Uppgift 1 f�rdig");


// 		System.out.println(reverse(Input.nextLine()));
//		System.out.println("Uppgift 2 f�rdig");
		
		
//		String str = Input.nextLine();
//		char c = Input.next().charAt(0);
//		System.out.println(c + " appears " + count(str, c) + " times in this string");
//		System.out.println("Uppgift 3 f�rdig");
		
		System.out.println(sjorovare(Input.nextLine()));
		
		
		Input.close();
	}

	public static double vol(double radius) {
		return ((4 * (radius * radius * radius) * 3.14) / 3);
	}

	public static String reverse(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = (reverse + str.charAt(i));
		}
		return reverse;

	}
	public static String count(String str, char c) {
		String count = "";
		int num = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == (c)) {
				num++;

			}
		} count = "" + num;
		return count;
	}

	public static String sjorovare(String str) {
		String sol = "";
		String cons = "bcdfghjklmnpqrstvwz";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < cons.length(); j++) {
				if (str.charAt(i) == cons.charAt(j) || str.charAt(i) == cons.toUpperCase().charAt(j)) {
					String arr = (str.charAt(i) + "o" + str.toLowerCase().charAt(i));
					sol = sol + arr;
					break;
				} else if (str.charAt(i) == 'x') {
					sol = sol + "koksos";
					break;
				} else if (str.charAt(i) == 'X') {
					sol = sol + "Koksos";
					break;
				} else if (j == cons.length() - 1) {
					sol = sol + str.charAt(i);
				}

			}
		}
		return sol;
	}
	
	
}
