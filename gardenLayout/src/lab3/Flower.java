package lab3;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower implements GardenInterface{
	Point2D position;
	Color color;
	boolean movable;
	Circle circle;
	
	public Flower() {
		
	}
	
	public Flower(Point2D position, Color color, boolean movable) {
		this.position = position.add(0,0); //not sure
		this.color = Color.RED;
		this.movable = true;
		
		circle = new Circle();
		circle.setCenterX(position.getX());
		circle.setCenterY(position.getY());
		circle.setRadius(30);
		circle.setFill(this.color);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(1);
	}
	
	public Circle getCircle() {
		return this.circle;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		
	}

	
}
