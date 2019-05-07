import java.util.Scanner;

public class whatdoesthefoxsay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();input.nextLine();

		for (int cases = 0; cases < num; cases++) {
			String intake = input.nextLine();
			String[] animals = intake.split(" ");

			boolean exit = false;
			while (!exit) {
				String whatanimalsay = input.nextLine();
				String[] removestring = whatanimalsay.split(" ");
				String removeword = removestring[2];
				if (whatanimalsay.equals("what does the fox say?")) {
					exit = true;
				}
				for (int i = 0; i < animals.length; i++) {
					if (animals[i] != null && animals[i].equals(removeword)) {
						animals[i] = null;
					}
				}

			}
			for (int a = 0; a < animals.length; a++) {
				if (animals[a] == null) {
				} else {
					System.out.print(animals[a] + " ");
				}
			}
		}
	}

}
