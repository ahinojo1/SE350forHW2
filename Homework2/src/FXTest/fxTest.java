package FXTest;

import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class fxTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text myText = new Text();
		myText.setText("toucha my spaghet");
		myText.setX(20);
		myText.setY(40);
		myText.setFont(new Font ("Arial", 30));
		
		AnchorPane root = new AnchorPane();
		ObservableList<Node> theList = root.getChildren();
		theList.add(myText);
		
		Scene scene = new Scene(root, 300,100);
		
		primaryStage.setTitle("Somebody");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
