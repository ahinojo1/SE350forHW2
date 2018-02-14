package lab3;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FlowerBed implements GardenInterface{
	Point2D position;
	double xCoord = 50;
	double yCoord = 50;
	Color color;
	boolean movable;
	Rectangle shape;
	List<Flower> group = new ArrayList<Flower>();
	
	public FlowerBed() {
		draw();
	}
	
	public void add() {
		
	}
	
	public void remove() {
		
	}
	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		
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

}
