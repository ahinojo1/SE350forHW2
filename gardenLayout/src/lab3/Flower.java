package lab3;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower implements Component{
	Point2D position;
	double xCoord = 0;
	double yCoord = 0;
	Color color;
	boolean movable;
	Circle circle;
	
	public Flower() {
		
	}
	
	public Flower(Point2D position, Color color, boolean movable) {
		this.position = position.add(xCoord, yCoord); //not sure
		this.color = color;
		this.movable = true;
		
		circle = new Circle();
		circle.setCenterX(position.getX());
		circle.setCenterY(position.getY());
		circle.setRadius(10);
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
		circle.setCenterX(circle.getCenterX()+deltaX);
		circle.setCenterY(circle.getCenterY()+deltaY);
	}

	
}
