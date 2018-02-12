package lab3;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FlowerBed implements GardenInterface{
	Point2D position;
	double xCoord = 0;
	double yCoord = 0;
	Color color;
	boolean movable;
	Rectangle shape;
	
	
	public FlowerBed() {
		draw();
	}
	
	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shape = new Rectangle();
		shape.setX(50);
		shape.setY(50);
		shape.setHeight(200);
		shape.setWidth(100);
		shape.setFill(Color.DARKGREEN);
		shape.setStroke(Color.BLACK);
	}
	
	public Rectangle getShape() {
		return this.shape;
	}

}
