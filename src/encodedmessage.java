import java.util.Scanner;

public class encodedmessage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int iterations = input.nextInt();

		for (int a = 0; a < iterations; a++) {
			String sequence = input.next();
			double root = Math.sqrt(sequence.length());
			root = Math.round(root);
			int jump = (int) root;
			String newsequence = "";
			int i = 1;

			while (newsequence.length() != sequence.length()) {
				newsequence += sequence.charAt(jump - 1);
				jump += root;
				if (jump > sequence.length()) {
					jump = (int) root;
					jump -= i;
					i++;
				}
			}
			System.out.println(newsequence);
			
		}input.close();
	}
}
