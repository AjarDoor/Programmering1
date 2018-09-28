package vecka39uppgifter;
import java.util.Scanner;
public class uppgifttre {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		
		System.out.println("SKREV NUMBUR TACK");
		
		double sum = 0;
		double i = 0;
		
		while (!exit) {
			double ta1 = input.nextInt();
			
			if (ta1 == 0) {
				exit = true;
			}
			sum = ta1 + sum;
			
			i++;
		}
		
		input.close();
		System.out.println("MEDEL VÄRDE VAR INNAN DU MÖTTE MIG " + sum / i);
		System.out.println("SUMMA AV DIN SKULD DITT LILLE SKIT " + sum);
		
	}

}
