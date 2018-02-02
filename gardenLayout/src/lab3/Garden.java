package lab3;

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Garden extends Application{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		//System.out.println("hi");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Flower flower = new Flower(new Point2D(100,100), Color.RED, true);
		
		Pane root = new Pane();
		
		root.getChildren().add(flower.getCircle());
		
		Scene scene = new Scene(root, 500,500);
		scene.setOnMouseDragged(mouseHandler);
		
		
		primaryStage.setTitle("GardenLayout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				Point2D clickPoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				String eventName = mouseEvent.getEventType().getName();
				
				switch(eventName) {
				case("MOUSE_DRAGGED"):
					if(lastPosition != null) {
						double deltaX = clickPoint.getX()-lastPosition.getX();
						double deltaY = clickPoint.getY()-lastPosition.getY();
						flower.move(deltaX,deltaY);
						
					}
				break;
				}
				lastPosition = clickPoint;
			}
		};
	}
	
	

}
