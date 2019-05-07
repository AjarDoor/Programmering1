package JavaFXuppgift;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Grafik extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Group root = new Group();
		Scene scene = new Scene(root,1600,1080,Color.GREY);
		primaryStage.setScene(scene);
		primaryStage.show();
		//root.getChildren().add(FlagMaker.greenland(300));
		//root.getChildren().add(FlagMaker.kuwait(300));
		//root.getChildren().add(FlagMaker.togo(300));
		//root.getChildren().add(FlagMaker.laos(300));
		//root.getChildren().add(FlagMaker.romania(300));
		//root.getChildren().add(FlagMaker.england(300));
		//root.getChildren().add(FlagMaker.genoa(300)); 
		//root.getChildren().add(FlagMaker.sweden(300));
		//root.getChildren().add(FlagMaker.denmark(300));
		//root.getChildren().add(FlagMaker.finland(300));
		//root.getChildren().add(FlagMaker.ferrara(300));
		//root.getChildren().add(FlagMaker.switzerland(300));
		//root.getChildren().add(FlagMaker.poland(300));
		//root.getChildren().add(FlagMaker.lübeck(300));
		//root.getChildren().add(FlagMaker.lucca(300));
		//root.getChildren().add(FlagMaker.monaco(300));
		root.getChildren().add(FlagMaker.austria(300));


	}
	public static void main(String[] args) {
		launch();
	}
}
