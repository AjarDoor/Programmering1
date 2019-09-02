package prr2;

import java.util.Scanner;

public class repuppg1 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		sum();
	}
	
	public static int sum() {
		
		System.out.println("Input '0' when done");
		boolean exit = false;
		int summa = 0;
		while(!exit) {
			
			summa =+ input.nextInt();
			
			if(input.nextInt() == 0) {
				exit = true;
			}
		}
		System.out.println("Summan av alla tal är " + summa);
		return summa;
	}

}
