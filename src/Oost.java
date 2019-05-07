import java.util.Scanner;
public class Oost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String intag = input.nextLine();
		String[] oostgootska = intag.split(" ");
		double fall = 0;
		int barrier = oostgootska.length;
		for(int i = 0; i < oostgootska.length; i++) {
			if(oostgootska[i].contains("ae") == true) {
				fall++;
				
			}
		}
		double laststand = fall / barrier;
		if(laststand == 0.4 || laststand > 0.4) {
			System.out.println("dae ae ju traeligt va");
		}else{
			System.out.println("haer talar vi rikssvenska");
		}
		input.close();
	}
}
