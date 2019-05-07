import java.util.Scanner;
public class everywhere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// inputen f�r test tar in antal iterationer av koden som ska g�ras och s�tter den i en for loop
		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
// inputen f�r var deklarerar hur m�nga rader ska inputtas innan den ger tillbaka slutv�rdet, 
// eller antal resor personen g�r under denna iteration
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

f�rsta inputten av koden s�ger hur m�nga iterationer av koden ska utf�ras
andra inputten av koden s�ger hur m�nga st�der/inputs (str�ngar) ska l�sas in tills den g�r till n�sta del
n�sta del �r att koden tar in str�ngerna och sen kollar och returnerar antalet av unika st�der
om man har angett ett nummer st�rre �n 1 i b�rjan av koden s� g�r den igenom for-loopen igen tills den tar slut.

variabelnamnen �r tack vare Emil's d�liga sk�mt

*/