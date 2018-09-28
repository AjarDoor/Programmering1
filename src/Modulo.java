import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		int var = 0;
		
		for (int i = 0; i < 10; i++) {
			int num = input.nextInt() % 42;
			
			if  (num % 42 != 0 || num == 0) {
				var++;
			}
		}
		
		input.close();
		
		System.out.println(var);
	}
}
