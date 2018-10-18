package enums;

import com.sun.media.sound.SoftMixingSourceDataLine;

import javafx.scene.paint.Color;

public class enum_test {
	public static void main(String[] args) {
		
		System.out.println(heat(Density.WATER,10,4190,1));
	}
	public static double heat(Density matter, double deltaT, double c, double volume) {
		
		return matter.den*c*deltaT;
	}

}
