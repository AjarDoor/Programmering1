package prr2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class layout_test extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		
		root.setTop(new Rectangle(100,50));

		Label left = new Label("Left");
		left.setAlignment(Pos.CENTER);
		root.setLeft(left);

		Circle cir = new Circle(50,Color.RED);
		root.setCenter(cir);
		
		root.setRight(new Label("Right"));
		Button exitButton = new Button("Exit");
		exitButton.setOnAction(event->{
			Stage s = new Stage();
			s.setScene(new Scene(new Group(),500,500,Color.SKYBLUE));
			s.show();
		});
		
		Button restartButton = new Button("Restart");
		HBox bottom = new HBox();
		bottom.getChildren().add(exitButton);
		bottom.getChildren().add(restartButton);
		bottom.getChildren().add(new Button("Home"));
		bottom.setAlignment(Pos.CENTER);
		root.setBottom(bottom);
		
		
		Scene scene = new Scene(root,500,500);
		
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch();
	}
	
	
	
	
}
