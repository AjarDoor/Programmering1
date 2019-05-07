package javaFX;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class FlagMaker {
	
	public static Flag kuwait(double width) {
		Flag flag = new Flag();
		
		Rectangle hStripe1 = new Rectangle();
		hStripe1.setWidth(width);
		hStripe1.setHeight(width / 2);
		hStripe1.setFill(Color.RED);

		
		Rectangle hStripe2 = new Rectangle();
		hStripe2.setWidth(width);
		hStripe2.setHeight(width / 3);
		hStripe2.setFill(Color.WHITE);

		
		Rectangle hStripe3 = new Rectangle();
		hStripe3.setWidth(width);
		hStripe3.setHeight(width / 6);
		hStripe3.setFill(Color.GREEN);

		
		Polygon lPoly = new Polygon(0,0 , 0,width/2 , width/4,width/3 , width/4,width/6);
		lPoly.setFill(Color.BLACK);

		flag.getChildren().addAll(hStripe1, hStripe2, hStripe3, lPoly);
		return flag;
	}
	
	public static Flag greenland(double width) {
		Flag flag = new Flag();
		
		Rectangle bottomRec = new Rectangle();
		bottomRec.setWidth(width);
		bottomRec.setHeight(width * 2 / 3);
		bottomRec.setFill(Color.RED);
		
		Rectangle topRec = new Rectangle();
		topRec.setWidth(width);
		topRec.setHeight(width / 3);
		topRec.setFill(Color.WHITE);
		
		Arc topArc = new Arc();
        topArc.setCenterX(width * 2 / 5);
        topArc.setCenterY(width / 3);
        topArc.setRadiusX(width * 2 / 8);
        topArc.setRadiusY(width * 2 / 8);
        topArc.setLength(180);
        topArc.setType(ArcType.ROUND);
        topArc.setFill(Color.RED);
        
        Arc bottomArc = new Arc();
        bottomArc.setCenterX(width * 2 / 5);
        bottomArc.setCenterY(width / 3);
        bottomArc.setRadiusX(width * 2 / 8);
        bottomArc.setRadiusY(width * 2 / 8);
        bottomArc.setStartAngle(180);
        bottomArc.setLength(180);
        bottomArc.setType(ArcType.ROUND);
        bottomArc.setFill(Color.WHITE);
        
        flag.getChildren().addAll(bottomRec, topRec, topArc, bottomArc);
        return flag;
	}
	public static Flag laos(double width) {
		Flag flag = new Flag();
		
		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width / 3 * 2);
		bg.setFill(Color.RED);
		
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(width);
		hStripe.setHeight(width / 3);
		hStripe.setTranslateY(width / 6);
		hStripe.setFill(Color.DARKBLUE);
		
		Circle cCircle = new Circle();
		cCircle.setRadius(width / 6 * 0.8);
		cCircle.setTranslateX(width / 2);
		cCircle.setTranslateY(width / 3);
		cCircle.setFill(Color.WHITE);

		flag.getChildren().addAll(bg, hStripe, cCircle);
		return flag;
	}
	
	public static Flag togo(double width) {
		Flag flag = new Flag();
		
		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width / 1.618);
		bg.setFill(Color.YELLOW);
		
		Rectangle vStripe1 = new Rectangle();
		vStripe1.setWidth(width);
		vStripe1.setHeight(width / 1.618 / 5);
		vStripe1.setTranslateY(0);
		vStripe1.setFill(Color.GREEN);
		
		Rectangle vStripe2 = new Rectangle();
		vStripe2.setWidth(width);
		vStripe2.setHeight(width / 1.618 / 5);
		vStripe2.setTranslateY(width / 1.618 * 2 / 5);
		vStripe2.setFill(Color.GREEN);

		Rectangle vStripe3 = new Rectangle();
		vStripe3.setWidth(width);
		vStripe3.setHeight(width / 1.618 / 5);
		vStripe3.setTranslateY(width / 2 );
		vStripe3.setFill(Color.GREEN);
		
		Rectangle tlSquare = new Rectangle();
		tlSquare.setWidth(width / 1.618 / 5 * 3);
		tlSquare.setHeight(width / 1.618 / 5 * 3);
		tlSquare.setTranslateY(0);
		tlSquare.setFill(Color.RED);
		
		Star tlStar = new Star(width / (1.618 * 2) / 5 * 2);
		tlStar.setTranslateX(width / 1.618 / 5 * 3 / 2);
		tlStar.setTranslateY(width / 1.618 / 5 * 3 / 2);
		tlStar.setFill(Color.WHITE);
		
		flag.getChildren().addAll(bg, vStripe1, vStripe2, vStripe3, tlSquare, tlStar);
		return flag;
	}

	public static Flag sweden(double width) {
		Flag flag = new Flag();
		
		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width * 5 / 8);
		bg.setFill(Color.BLUE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(width);
		hStripe.setHeight(width / 8);
		hStripe.setTranslateY(width * 2 / 8);
		hStripe.setFill(Color.YELLOW);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(width / 8);
		vStripe.setHeight(width * 5 / 8);
		vStripe.setTranslateX(width * 2 / 8);
		vStripe.setFill(Color.YELLOW);

		flag.getChildren().addAll(bg, hStripe, vStripe);

		return flag;
	}

	public static Flag denmark(double width) {
		Flag flag = new Flag();
		
		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width * 28 / 37);
		bg.setFill(Color.RED);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(width);
		hStripe.setHeight(width / 8);
		hStripe.setTranslateY(width * 2 / 6);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(width / 8);
		vStripe.setHeight(width * 28 / 37);
		vStripe.setTranslateX(width * 2 / 7.25);
		vStripe.setFill(Color.WHITE);

		flag.getChildren().addAll(bg, hStripe, vStripe);

		return flag;
	}

	public static Flag finland(double width) {
		Flag flag = new Flag();
		
		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width * 11 / 18);
		bg.setFill(Color.WHITE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(width);
		hStripe.setHeight(width * 3 / 18);
		hStripe.setTranslateY(width / 4.5);
		hStripe.setFill(Color.DARKBLUE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(width * 3 / 18);
		vStripe.setHeight(width * 11 / 18);
		vStripe.setTranslateX(width / 4);
		vStripe.setFill(Color.DARKBLUE);

		flag.getChildren().addAll(bg, hStripe, vStripe);

		return flag;
	}

	public static Flag england(double width) {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width * 3 / 5);
		bg.setFill(Color.WHITE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(width);
		hStripe.setHeight(width / 8);
		hStripe.setTranslateY(width * 2 / 8);
		hStripe.setFill(Color.RED);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(width / 8);
		vStripe.setHeight(width * 3 / 5);
		vStripe.setTranslateX(width * 2 / 5);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, hStripe, vStripe);

		return flag;
	}
	//"The flag of Genoa is a St. George's Cross,
	//a red cross on a white field; the flag of England comes from the flag of Genoa"
	// TLDR different countries with 'different' flags
	public static Flag genoa(double width) {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width * 3 / 5);
		bg.setFill(Color.WHITE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(width);
		hStripe.setHeight(width / 8);
		hStripe.setTranslateY(width * 2 / 8);
		hStripe.setFill(Color.RED);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(width / 8);
		vStripe.setHeight(width * 3 / 5);
		vStripe.setTranslateX(width * 2 / 5);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, hStripe, vStripe);

		return flag;
	}


	public static Flag ferrara(double width) {
		Flag flag = new Flag();
		Rectangle bottomRect = new Rectangle();
		bottomRect.setWidth(width);
		bottomRect.setHeight(width / 3);
		bottomRect.setFill(Color.BLACK);

		Rectangle topRect = new Rectangle();
		topRect.setWidth(width);
		topRect.setHeight(width / 3 * 2);
		topRect.setFill(Color.WHITE);

		flag.getChildren().addAll(topRect, bottomRect);
		return flag;
	}

	public static Flag romania(double width) {
		Flag flag = new Flag();
		Rectangle rStripe = new Rectangle();
		rStripe.setWidth(width);
		rStripe.setHeight(width / 3 * 2);
		rStripe.setFill(Color.BLUE);

		Rectangle mStripe = new Rectangle();
		mStripe.setWidth(2 * width / 3);
		mStripe.setHeight(width / 3 * 2);
		mStripe.setFill(Color.YELLOW);

		Rectangle lStripe = new Rectangle();
		lStripe.setWidth(width / 3);
		lStripe.setHeight(width / 3 * 2);
		lStripe.setFill(Color.RED);

		flag.getChildren().addAll(lStripe, mStripe, rStripe);
		return flag;
	}
	
	public static Flag italy(double width) {
		Flag flag = new Flag();
		Rectangle rStripe = new Rectangle();
		rStripe.setWidth(width);
		rStripe.setHeight(width / 3 * 2);
		rStripe.setFill(Color.GREEN);

		Rectangle mStripe = new Rectangle();
		mStripe.setWidth(2 * width / 3);
		mStripe.setHeight(width / 3 * 2);
		mStripe.setFill(Color.WHITE);

		Rectangle lStripe = new Rectangle();
		lStripe.setWidth(width / 3);
		lStripe.setHeight(width / 3 * 2);
		lStripe.setFill(Color.RED);

		flag.getChildren().addAll(lStripe, mStripe, rStripe);
		return flag;
	}
	
	public static Flag switzerland(double width) {
		Flag flag = new Flag();
		
		Rectangle bg = new Rectangle();
		bg.setWidth(width);
		bg.setHeight(width);
		bg.setFill(Color.RED);
		
		Rectangle hCross = new Rectangle();
		hCross.setWidth(width * 5 / 8);
		hCross.setHeight(width * 2 / 8);
		hCross.setTranslateY(width * 12 / 32);
		hCross.setTranslateX(width * 6 / 32);
		hCross.setFill(Color.WHITE);
		
		Rectangle vCross = new Rectangle();
		vCross.setWidth(width * 2 / 8);
		vCross.setHeight(width * 5 / 8);
		vCross.setTranslateX(width * 12 / 32);
		vCross.setTranslateY(width * 6 / 32);
		vCross.setFill(Color.WHITE);
		
		flag.getChildren().addAll(bg, hCross, vCross);
		return flag;
	}
	public static Flag poland(double width) {
		Flag flag = new Flag();
		
		Rectangle bottomRect = new Rectangle();
		bottomRect.setWidth(width);
		bottomRect.setHeight(width * 5 / 8);
		bottomRect.setFill(Color.RED);

		Rectangle topRect = new Rectangle();
		topRect.setWidth(width);
		topRect.setHeight((width * 5 / 8) / 2);
		topRect.setFill(Color.WHITE);

		flag.getChildren().addAll(bottomRect, topRect);
		return flag;
	}
	public static Flag lucca(double width) {
		Flag flag = new Flag();
		
		Rectangle bottomRect = new Rectangle();
		bottomRect.setWidth(width);
		bottomRect.setHeight(width * 5 / 8);
		bottomRect.setFill(Color.RED);

		Rectangle topRect = new Rectangle();
		topRect.setWidth(width);
		topRect.setHeight((width * 5 / 8) / 2);
		topRect.setFill(Color.WHITE);

		flag.getChildren().addAll(bottomRect, topRect);
		return flag;
	}
	public static Flag lübeck(double width) {
		Flag flag = new Flag();
		
		Rectangle bottomRect = new Rectangle();
		bottomRect.setWidth(width);
		bottomRect.setHeight(width * 5 / 8);
		bottomRect.setFill(Color.RED);

		Rectangle topRect = new Rectangle();
		topRect.setWidth(width);
		topRect.setHeight((width * 5 / 8) / 2);
		topRect.setFill(Color.WHITE);

		flag.getChildren().addAll(bottomRect, topRect);
		return flag;
	}
	// Not the territory of Lübeck, but the Free City of Lübeck, which was the leader of the Hanseatic League controlling
	// the trade in and out of the Baltic Sea
	public static Flag monaco(double width) {
		Flag flag = new Flag();
		
		Rectangle bottomRect = new Rectangle();
		bottomRect.setWidth(width);
		bottomRect.setHeight(width * 5 / 8);
		bottomRect.setFill(Color.WHITE);

		Rectangle topRect = new Rectangle();
		topRect.setWidth(width);
		topRect.setHeight((width * 5 / 8) / 2);
		topRect.setFill(Color.CRIMSON);

		flag.getChildren().addAll(bottomRect, topRect);
		return flag;
	}
	
	public static Flag austria(double width) {
		Flag flag = new Flag();
		
		Rectangle hStripe1 = new Rectangle();
		hStripe1.setWidth(width);
		hStripe1.setHeight((width * 3 / 3) / 1.5);
		hStripe1.setFill(Color.RED);

		
		Rectangle hStripe2 = new Rectangle();
		hStripe2.setWidth(width);
		hStripe2.setHeight((width * 2 / 3) / 1.5);
		hStripe2.setFill(Color.WHITE);

		
		Rectangle hStripe3 = new Rectangle();
		hStripe3.setWidth(width);
		hStripe3.setHeight((width * 1 / 3) / 1.5);
		hStripe3.setFill(Color.RED);
		
		flag.getChildren().addAll(hStripe1, hStripe2, hStripe3);
		return flag;
	}

}
