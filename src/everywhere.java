import java.util.Scanner;
public class everywhere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// inputen för test tar in antal iterationer av koden som ska göras och sätter den i en for loop
		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
// inputen för var deklarerar hur många rader ska inputtas innan den ger tillbaka slutvärdet, 
// eller antal resor personen gör under denna iteration
			int var = input.nextInt();

			String trash = input.nextLine();

			int res = 0;

			String[] arr = new String[var];

			for (int j = 0; j < var; j++) {

				String coke = input.nextLine();

				for (int index = 0; index < var; index++) {

					if (index != var + 1) {
						try {
							if (arr[index].equals(coke)) {
								break;
							}
						} catch (NullPointerException e) {
							arr[index] = coke;
							res++;
							break;
						}
					}

				}

			}

			System.out.println(res);
			System.out.println(trash);
			
		}

		input.close();

	}

}

/*

första inputten av koden säger hur många iterationer av koden ska utföras
andra inputten av koden säger hur många städer/inputs (strängar) ska läsas in tills den går till nästa del
nästa del är att koden tar in strängerna och sen kollar och returnerar antalet av unika städer
om man har angett ett nummer större än 1 i början av koden så går den igenom for-loopen igen tills den tar slut.

variabelnamnen är tack vare Emil's dåliga skämt

*/