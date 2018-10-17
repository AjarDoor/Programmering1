package methods;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String str = Input.nextLine();
		for (int i = 0; i < str.length(); i++) {
			for(int b = str.length(); b != i; b--) {
				System.out.println(str.replace(str.charAt(i), str.charAt(b)));
			}
		}
	}
	
}