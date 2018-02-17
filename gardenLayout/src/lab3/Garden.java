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
	public Point2D lastPosition = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		//System.out.println("hi");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Flower flower = new Flower(new Point2D(100,100), Color.RED, true);
		Flower flower2 = new Flower(new Point2D(100,100), Color.YELLOW, true);
		FlowerBed bed = new FlowerBed();
		Pane root = new Pane();
		
		root.getChildren().add(bed.getShape());
		root.getChildren().add(flower.getCircle());
		root.getChildren().add(flower2.getCircle());
		
		Scene scene = new Scene(root, 800,800);
		scene.setFill(Color.ALICEBLUE);
		
		primaryStage.setTitle("GardenLayout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				
				Point2D clickPoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				Point2D releasePoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				String eventName = mouseEvent.getEventType().getName();
				
				//Point2D lastPosition = new Point2D(clickPoint.getX(),clickPoint.getY()); //not sure
				switch(eventName) {
				case("MOUSE_DRAGGED"):
					if(lastPosition != null) {
						//if(lastPosition.getX() > flower.xCoord + )
						double deltaX = clickPoint.getX()-lastPosition.getX();
						double deltaY = clickPoint.getY()-lastPosition.getY();
						flower.move(deltaX,deltaY);
						
					}
				case("MOUSE_RELEASED"):
					if(releasePoint.getX() == bed.getX() && releasePoint.getY() == bed.getY()) {
						bed.add(flower);
					}
				case("MOUSE_PRESSED"):
					//Point2D p1 = new Point2D(clickPoint.getX(), clickPoint.getY());
					//Flower flower2 = new Flower(p1, Color.YELLOW, true);
					
				break;
				}
				lastPosition = clickPoint;
			}
		};
		scene.setOnMouseDragged(mouseHandler);
		scene.setOnMouseReleased(mouseHandler);
		scene.setOnMousePressed(mouseHandler);
	}
	
	

}
