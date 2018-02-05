package hw2; //professor's implementation

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class OceanExplorer extends Application{

	boolean[][] islandMap;  
	Pane root;
	final int dimensions = 10;
	final int islandCount = 10;
	final int scalingFactor = 50;
	Image shipImage;
	ImageView shipImageView;
	OceanMap oceanMap;
	Scene scene;
	Ship ship;
	
	@Override
	public void start(Stage mapStage) throws Exception {
		
		oceanMap = new OceanMap(dimensions, islandCount);
		islandMap = oceanMap.getMap(); // Note: We will revisit this in a future class and use an iterator instead of exposing the underlying representation!!!
		
		root = new AnchorPane();	
		drawMap();

		ship = new Ship(oceanMap);	
		loadShipImage();	
		
		scene = new Scene(root,500,500);
		mapStage.setTitle("Christopher Columbus Sails the Ocean Blue");
		mapStage.setScene(scene);
		mapStage.show();
		startSailing();
	}
		 
    private void loadShipImage(){
		//Image shipImage = new Image("ship.png",50,50,true,true);
    	Image shipImage = new Image("file:///F:/GitHub3/SE350forHW2/Homework2/src/profColumbus/ship.png",50,50,true,true);
		shipImageView = new ImageView(shipImage);
		shipImageView.setX(oceanMap.getShipLocation().x*scalingFactor);
		shipImageView.setY(oceanMap.getShipLocation().y*scalingFactor);
		root.getChildren().add(shipImageView);
	}
	
	private void startSailing(){
		scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

			@Override
			public void handle(KeyEvent ke) {
				switch(ke.getCode()){
				case RIGHT:
					ship.goEast();
					break;
				case LEFT:
					ship.goWest();
					break;
				case UP:
					ship.goNorth();
					break;
				case DOWN:
					ship.goSouth();
					break;
				default:
					break;
				}
				shipImageView.setX(ship.getShipLocation().x*scalingFactor);
				shipImageView.setY(ship.getShipLocation().y*scalingFactor);
			}
		});
	}
	
	// Draw ocean and islands
	public void drawMap(){
		for(int x = 0; x < dimensions; x++){
			for(int y = 0; y < dimensions; y++){
				Rectangle rect = new Rectangle(x*scalingFactor,y*scalingFactor,scalingFactor,scalingFactor);
				rect.setStroke(Color.BLACK);
				if(islandMap[x][y])
				    rect.setFill(Color.GREEN);
				else
					rect.setFill(Color.PALETURQUOISE);
				root.getChildren().add(rect);
			}
		}
	}
	
	public static void main(String[] args) {
     	launch(args);
    }

}
