package javaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class former extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.DARKGREEN);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Circle circle = new Circle();
		
		circle.setRadius(75);
		
		circle.setTranslateX(250);
		circle.setTranslateY(250);
		circle.setFill(Color.RED);
		circle.setRotationAxis(Rotate.X_AXIS);
		circle.setRotate(45);
		
		root.getChildren().add(circle);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setWidth(50);
		rectangle.setHeight(rectangle.getWidth());
		rectangle.setFill(Color.LIME);
		
		root.getChildren().add(rectangle);
		
		Polygon polygon2 = new Polygon(150,48,180,96,210,48);
		
		
		

		
		root.getChildren().add(polygon2);
		
//		Star star = new Star(50);
//		
//		star.setTranslateX(250);
//		star.setTranslateY(250);
//		
//		root.getChildren().add(star);

		Car car = new Car(Color.BLUE);
		root.getChildren().add(car);
		car.setTranslateX(200);
		car.setTranslateY(225);
	}
	public static void main(String[] args) {
		launch();
	}

}
