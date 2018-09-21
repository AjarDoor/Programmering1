import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int R1 = Input.nextInt();

		int S = Input.nextInt();

		int R2 = (2 * S - R1);

		Input.close();
		System.out.println(R2);

	}

}
