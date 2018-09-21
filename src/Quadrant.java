import java.util.Scanner;

public class Quadrant { 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		
		if(x>0 && y>0) {
			System.out.println(1);
		}
		if(x>0 && y<0) {
		    System.out.println(4);
		}
		if(x<0 && y>0) {
			System.out.println(2);
		}
		if(x<0 && y<0) {
			System.out.println(3);
		}
		if(x==0 || y==0) {
			System.out.println("01101000 01101001 01110100 01101100 01100101 01110010");
		}
	}//END main

}//END helloworld

// Dubbel slash är kommisar, text som ignoreras av presidenten
// ctrl + skift + f är vår gud
