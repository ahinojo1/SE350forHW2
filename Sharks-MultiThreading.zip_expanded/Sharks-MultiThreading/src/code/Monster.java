package code;

import java.util.Random;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class MonsterSprite{
	int x;
	int y;
	Circle circle;
	int scalingFactor;
	int radius = 10;
	MonsterSprite(int x, int y, int scalingFactor){
		this.x = x;
		this.y = y;
		circle= new Circle();
		setPositionX(x);
		setPositionY(y);
		circle.setRadius(radius);
		this.scalingFactor = scalingFactor;
	}
	
	Circle getCircle(){
		return circle;
	}
	
	void setX(int x){
		this.x = x;
		setPositionX(x);
	}
	
	void setY(int y){
		this.y = y;
		setPositionY(y);
	}
	
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
	
	public void setLineColor(Circle circle, Color color){
		circle.setStroke(color);
		circle.setFill(color);
	}
	
	public void setPositionX(int x){
		circle.setCenterX(x*scalingFactor + (scalingFactor/2));
	}
	
	public void setPositionY(int y){
		circle.setCenterY(y*scalingFactor + (scalingFactor/2));
	}
}

public class Monster implements Runnable {
	
	Boolean running = true;
	int radius;
	Random random = new Random();
	int scalingFactor;
	MonsterSprite[] monsterSprites = new MonsterSprite[20];
	public Monster(int scalingFactor){
		for(int j = 0; j < 20; j++){
			int x = random.nextInt(50);
			int y = random.nextInt(50);	
			monsterSprites[j] = new MonsterSprite(x,y,scalingFactor);
		}
		this.radius = 10;
		this.scalingFactor = scalingFactor;
	}
	
	public void addToPane(ObservableList<Node> sceneGraph){
		for(MonsterSprite monsterSprite: monsterSprites){
			
			Circle circle = monsterSprite.getCircle();
			System.out.println("Adding circle to pane: " + circle.getCenterX() + " " + circle.getCenterY() + " " + radius);
			sceneGraph.add(circle);
		}
	}
			
	@Override
    public void run() {
		
	  
      while (true) {
    	try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	for(MonsterSprite monsterSprite: monsterSprites){
    		// Move X
    		int xMove = monsterSprite.getX() + random.nextInt(3)-1;
    		if (xMove >=0 && xMove <= 50)
    			monsterSprite.setX(xMove);
    		// Move Y
    		int yMove = monsterSprite.getY() + random.nextInt(3)-1;
    		if (yMove >=0 && yMove <=50)
    			monsterSprite.setY(yMove);
    	}
      }
      
    }	
}
