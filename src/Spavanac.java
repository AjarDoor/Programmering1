import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int m = input.nextInt();
		
		if (h - 1 < 0) {
			h = h + 24;
		}
		
		if (m - 45 < 0) {
			h = h - 1;
			m = m + 15;
		}else {
			m = m - 45;
		}
		
		input.close();
		
		System.out.println(h + " " + m);
	}
	
	
}
