import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class uppgifter {

	// 100 tal i intervallet [0-9]
	static int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4,
			3, 2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
			5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

	// 100 namn
	static String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
			"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
			"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola", "Margie",
			"Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney", "Diana",
			"Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami", "Lashanda",
			"Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee", "Yael", "Kelle",
			"Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady", "Rigoberto", "Felicia",
			"Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela", "Ophelia", "Alesha",
			"Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin", "Emmie", "Mickie",
			"Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

	public static void main(String[] args) {

		upg9();

	}

	public static void upg1() {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static void upg2() {
		int counter = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == "Tom") {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static void upg3() {
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				count[0]++;
			} else if (numbers[i] == 1) {
				count[1]++;
			} else if (numbers[i] == 2) {
				count[2]++;
			} else if (numbers[i] == 3) {
				count[3]++;
			} else if (numbers[i] == 4) {
				count[4]++;
			} else if (numbers[i] == 5) {
				count[5]++;
			} else if (numbers[i] == 6) {
				count[6]++;
			} else if (numbers[i] == 7) {
				count[7]++;
			} else if (numbers[i] == 8) {
				count[8]++;
			} else if (numbers[i] == 9) {
				count[9]++;
			} else {
				System.out.println("Number at index: " + i + " is greater than 9");
			}
		}
		int largest = 0;
		for (int i = 1; i < count.length; i++) {
			if (count[i] > count[largest])
				largest = i;
		}
		System.out.println(largest + " förekommer mest");

		int smallest = 0;
		for (int i = 1; i < count.length; i++) {
			if (count[i] < count[smallest])
				smallest = i;
		}
		System.out.println(smallest + " förekommer minst");
	}

	public static void upg4() {
		int index = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == "Drusilla")
				index = i;
		}
		System.out.println("Drusilla finns på index: " + index);
	}

	public static void upg5() {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
				sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void upg6() {
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				count[0]++;
			} else if (numbers[i] == 1) {
				count[1]++;
			} else if (numbers[i] == 2) {
				count[2]++;
			} else if (numbers[i] == 3) {
				count[3]++;
			} else if (numbers[i] == 4) {
				count[4]++;
			} else if (numbers[i] == 5) {
				count[5]++;
			} else if (numbers[i] == 6) {
				count[6]++;
			} else if (numbers[i] == 7) {
				count[7]++;
			} else if (numbers[i] == 8) {
				count[8]++;
			} else if (numbers[i] == 9) {
				count[9]++;
			} else {
				System.out.println("Number at index: " + i + " is greater than 9");
			}
		}
		for (int a = 0; a < count.length; a++) {
			System.out.println(a + " förekommer " + count[a] + " gånger");
		}
	}

	public static void upg7() {
		int Lcount = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("L")) {
				Lcount++;
			}
		}
		System.out.println(Lcount + " namn börjar med L");
	}

	public static void upg8() {
		for (int i = 0; i < names.length; i++) {
			boolean unique = true;
			for (int j = 0; j < i; j++) {
				if (names[i] == names[j]) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(names[i] + " is unique");
			}
		}
	}

	public static void upg9() {
		for (int j = 0; j < names.length; j++) {
			for (int i = j + 1; i < names.length; i++) {
				if (names[i].compareTo(names[j]) < 0) {
					String t = names[j];
					names[j] = names[i];
					names[i] = t;
				}
			}
		}
		String mostcommon = null;
		int frequency = 0;
		int num = 0;
		for (int i = 0; i < names.length; i++) {
			num++;
			if (i == names.length - 1 || !names[i].equals(names[i + 1])) {
				if (num > frequency) {
					mostcommon = names[i];
					frequency = num;
				}
				num = 0;
			}
		}
		System.out.println(mostcommon + " is the most frequent, appearing " + frequency + " times");
	}
}
