package lab3;

import java.util.ArrayList;
import java.util.List;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FlowerBed implements Component{
	Point2D position;
	double xCoord = 50;
	double yCoord = 50;
	Point2D lastPosition = null;
	Color color;
	boolean movable;
	Rectangle shape;
	List<GardenInterface> group = new ArrayList<GardenInterface>();
	
	public FlowerBed() {
		draw();
	}
	
<<<<<<< HEAD
	public void add(Flower f) {
		group.add(f);
=======
	public void add(GardenInterface g) {
		//group.
>>>>>>> 2239595d9887e725844803523f5e491e46873ab6
	}
	
	public void remove(Flower f) {
		group.remove(f);
	}
	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent mouseEvent) {
				// TODO Auto-generated method stub
				Point2D clickPoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				Point2D releasePoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				String eventName = mouseEvent.getEventType().getName();
				
				switch(eventName) {
				case("MOUSE_PRESSED"):
					if(lastPosition != null) {
						//if(lastPosition.getX() > flower.xCoord + )
						double deltaX = clickPoint.getX()-lastPosition.getX();
						double deltaY = clickPoint.getY()-lastPosition.getY();
						shape.setX(shape.getX()+deltaX);
						shape.setY(shape.getY()+deltaY);
						
					}
				}
			}
		};
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shape = new Rectangle();
		shape.setX(xCoord);
		shape.setY(yCoord);
		shape.setHeight(200);
		shape.setWidth(100);
		shape.setFill(Color.DARKGREEN);
		shape.setStroke(Color.BLACK);
	}
	
	public Rectangle getShape() {
		return this.shape;
	}
	
	public double getX() {
		return xCoord;
	}
	
	public double getY() {
		return yCoord;
	}

}
