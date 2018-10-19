package strings;

import java.util.Scanner;

public class stringpractice {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
//		double radius = input.nextDouble(); //Uppgift 1
//		System.out.println("radien är " + vol(radius));
//		System.out.println("Uppgift 1 färdig");


// 		System.out.println(reverse(input.nextLine())); //Uppgift 2
//		System.out.println("Uppgift 2 färdig");
		
		
//		String str = input.nextLine(); //Uppgift 3
//		char c = input.next().charAt(0);
//		System.out.println(c + " appears " + count(str, c) + " times in this string");
//		System.out.println("Uppgift 3 färdig");
		
//		System.out.println(sjorovare(input.nextLine())); //Uppgift 4
//		System.out.println("Uppgift 4 färdig");
		
		input.close();
	}

	// Uppgift 1
	public static double vol(double radius) {
		return ((4 * (radius * radius * radius) * 3.14) / 3);
	}
// Uppgift 2
	public static String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = (reverse + str.charAt(i));
		}
		return reverse;
	}
// Uppgift 3
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
// Uppgift 4
	public static String sjorovare(String str) {
		String sol = ""; 
		String cons = "bcdfghjklmnpqrstvwz";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < cons.length(); j++) {
				if (str.charAt(i) == cons.charAt(j) || str.charAt(i) == cons.toUpperCase().charAt(j)) {
					String arr = (str.charAt(i) + "o" + str.toLowerCase().charAt(i));
					sol = sol + arr; break;
				} else if (str.charAt(i) == 'x') { sol = sol + "koksos"; break;
				} else if (str.charAt(i) == 'X') { sol = sol + "Koksos"; break;
				} else if (j == cons.length() - 1) {sol = sol + str.charAt(i);}
			}
		} return sol;
	}
	
	
}
