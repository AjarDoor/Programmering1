package javaFX;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Bilspel extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Group root = new Group();
		Scene scene = new Scene(root,1500,500,Color.MIDNIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Car car = new Car(Color.CRIMSON);
		root.getChildren().add(car);
		
		AnimationTimer at = new AnimationTimer() {
			int dir = 1;
			@Override
			public void handle(long now) {
				
				car.setTranslateX(car.getTranslateX() + 5 * dir);
				
				if(car.getTranslateX() > 1500-100 || car.getTranslateX() < 0) {
					dir = dir * -1;
					car.setRotationAxis(Rotate.Y_AXIS);
					car.setRotate(car.getRotate() + 180);
				}
				
				
				
			}
		};
		
		scene.setOnKeyPressed(e -> {
			KeyCode key = e.getCode();
			
		});
		
		at.start();
	}
	public static void main(String[] args) {
		launch();
	}
}
