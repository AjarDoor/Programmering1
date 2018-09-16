import java.util.Scanner;

public class Uppgiftvecka37 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Ge mig tio heltal");
		
		double num1 = input.nextDouble();
		double smallestnum = num1;
		double largestnum = num1;
		
		double num2 = input.nextDouble();
		if (num2 < smallestnum) {smallestnum = num2;}
		if (num2 > largestnum) {largestnum= num2;}
		
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
		
		System.out.println("The smallest number is: " + smallestnum);
		System.out.println("The largest number is: " + largestnum);
	}



}
