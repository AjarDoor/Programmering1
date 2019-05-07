import java.util.Scanner;
public class bijele {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		if (a > 1) {
			a = 1 - a;
		}else if (a < 1) {
			a = 1 + Math.abs(a);
		}else if( a == 1) {
			a = 0;
		}
		
		if (b > 1) {
			b = 1 - b;
		}else if (b < 1) {
			b = 1 + Math.abs(b);
		}else if( b == 1) {
			b = 0;
		}
		
		if (c > 2) {
			c = 2 - c;
		}else if(c == 1) {
			c = 1;
		}else if (c < 2) {
			c = 2 + Math.abs(c);
		}else if( c == 2) {
			c = 0;
		}
		
		if (d > 2) {
			d = 2 - d;
		}else if(d == 1) {
			d = 1;
		}else if (d < 2) {
			d = 2 + Math.abs(d);
		}else if( d == 2) {
			d = 0;
		}
		
		if (e > 2) {
			e = 2 - e;
		}else if(e == 1) {
			e = 1;
		}else if (e < 2) {
			e = 2 + Math.abs(e);
		}else if( e == 2) {
			e = 0;
		}
		
		if (f > 8) {
			f = 8 - f;
		}else if (f < 0) {
			f = 8 + Math.abs(f);
		}else if (f < 8) {
			f = 8 - f;
		}else if( f == 8) {
			f = 0;
		}
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
		input.close();
	}
}
