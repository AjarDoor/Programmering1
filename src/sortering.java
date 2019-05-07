
public class sortering {
	
	public static void sort(int[] array) {

		for (int j = 0; j < array.length; j++) {
			int min = array[j];
			int index = 0;
		
			for (int i = j+1; i < array.length; i++) {
				
				if (min > array[i]) {
					min = array[i];
					index = i;
				}
			}
			int temp = array[j];
			array[j] = array[index];
			array[index] = temp;
			
			System.out.println(uppgifter.numbers[j]);
		}
	}
}
