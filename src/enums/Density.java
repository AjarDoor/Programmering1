package enums;

public enum Density{
	
	WATER(998),AIR(1.29),IRON(4380);
	
	double den;
	
	Density(double d) {
		
		den = d;
	}

}
