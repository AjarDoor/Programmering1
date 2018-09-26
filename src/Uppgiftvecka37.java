import java.util.Scanner;

public class Uppgiftvecka37 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give me ten numbers");
		
		double num1 = input.nextDouble();
		double smallestnum = num1; // We make our very first input the largest and the smallest number so it sets the bar for lowest and highest number and gives these two variables a base value
		double largestnum = num1;
		
		double num2 = input.nextDouble(); // This lets the program know that we want to make a new input with a different variable
		if (num2 < smallestnum) {smallestnum = num2;} // If the number in this input is greater than the current largest number then it becomes the new largest number
		if (num2 > largestnum) {largestnum= num2;} // If the number in this input is less than the current smallest number then it becomes the new smallest number
		
		double num3 = input.nextDouble();
		if (num3 < smallestnum) {smallestnum = num3;}
		if (num3 > largestnum) {largestnum= num3;}
		
		double num4 = input.nextDouble();
		if (num4 < smallestnum) {smallestnum = num4;}
		if (num4 > largestnum) {largestnum= num4;}
		
		double num5 = input.nextDouble();
		if (num5 < smallestnum) {smallestnum = num5;}
		if (num5 > largestnum) {largestnum= num5;}
		
		double num6 = input.nextDouble();
		if (num6 < smallestnum) {smallestnum = num6;}
		if (num6 > largestnum) {largestnum= num6;}
		
		double num7 = input.nextDouble();
		if (num7 < smallestnum) {smallestnum = num7;}
		if (num7 > largestnum) {largestnum= num7;}
		
		double num8 = input.nextDouble();
		if (num8 < smallestnum) {smallestnum = num8;}
		if (num8 > largestnum) {largestnum= num8;}
		
		double num9 = input.nextDouble();
		if (num9 < smallestnum) {smallestnum = num9;}
		if (num9 > largestnum) {largestnum= num9;}
		
		double num10 = input.nextDouble();
		if (num10 < smallestnum) {smallestnum = num10;}
		if (num10 > largestnum) {largestnum= num10;}
		
		input.close();
		double totalsum = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10);
		double median = (totalsum/10); // 10 Is the number of inputs required, so to get the median we divide the total by the number of inputs made
		
		System.out.println("The smallest number is: " + smallestnum);
		System.out.println("The largest number is: " + largestnum);
		System.out.println("The median value is: " + median);
	}

}