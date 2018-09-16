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
		
		double num3 = input.nextDouble();
		if (num3 < smallestnum) {smallestnum = num3;}
		
		double num4 = input.nextDouble();
		if (num4 < smallestnum) {smallestnum = num4;}
		
		double num5 = input.nextDouble();
		if (num5 < smallestnum) {smallestnum = num5;}
		
		double num6 = input.nextDouble();
		if (num6 < smallestnum) {smallestnum = num6;}
		
		double num7 = input.nextDouble();
		if (num7 < smallestnum) {smallestnum = num7;}
		
		double num8 = input.nextDouble();
		if (num8 < smallestnum) {smallestnum = num8;}
		
		double num9 = input.nextDouble();
		if (num9 < smallestnum) {smallestnum = num9;}
		
		double num10 = input.nextDouble();
		if (num10 < smallestnum) {smallestnum = num10;}
		
		input.close();
		
		System.out.println("Smallest Number: " + smallestnum);
	}



}
