package vecka39uppgifter;
import java.util.Scanner;
public class uppgifttvå {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tal = input.nextInt();
		
		int length = String.valueOf(tal).length();
		
		double var = 0;
		
		double ta1 = 0;
		
		for(int i = 0; i <= length; i++) {
			
			int var1 = (int) (tal % Math.pow(10, (i-1)));
			
			ta1 = ((tal % Math.pow(10, i) - var1) / Math.pow(10, (i-1)));
			
			var = var + ta1;
		}
		System.out.println("sum of digits is " + var);
		
		input.close();
	}

}
