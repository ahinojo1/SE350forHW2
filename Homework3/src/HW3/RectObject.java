package HW3;



import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class RectObject implements Component{
	double x;
	double y;
	Shape s = new Rectangle();
	Color c;
	
	
	public RectObject(double xCoord, double yCoord) {
		x = xCoord;
		y = yCoord;
		c = getRandColor();
	}


	@Override
	public static void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		
	}
	
	public Shape getCurrentShape() {
		return s;
		
	}
	
	public Color getRandColor() {
		//returns a random color from a set of four basic colors
		Color[] colors = new Color[4];
		colors[0] = Color.BLUE;
		colors[1] = Color.GREEN;
		colors[2] = Color.YELLOW;
		colors[3] = Color.RED;
		Random rand = new Random();
		int colorID = rand.nextInt();
		return colors[colorID];
		
	}
	
}
