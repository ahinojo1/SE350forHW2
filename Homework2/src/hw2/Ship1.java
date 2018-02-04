package hw2;

import java.awt.Point;

import hw2.OceanMap1;



public class Ship1 {
    Point currentLocation;
    OceanMap1 oceanMap;
    
    public Ship1(OceanMap1 oceanMap2){    	
    	this.oceanMap = oceanMap2;
    	currentLocation = oceanMap2.getShipLocation();
    }
    
    public Point getShipLocation(){
    	return currentLocation;
    }
    
    public void goEast(){
    	if(currentLocation.x<oceanMap.getDimensions()-1 && oceanMap.isOcean(currentLocation.x+1, currentLocation.y)){
    		currentLocation.x++;
    	}  			
    }
    
    public void goWest(){
    	if(currentLocation.x >0 && oceanMap.isOcean(currentLocation.x-1, currentLocation.y)){
    		currentLocation.x--;
    	}  			
    }
    
    public void goNorth(){
    	if(currentLocation.y>0 && oceanMap.isOcean(currentLocation.x, currentLocation.y-1)){
    		currentLocation.y--;
    	}  			
    }
    
    public void goSouth(){
    	if(currentLocation.y<oceanMap.getDimensions()-1 && oceanMap.isOcean(currentLocation.x, currentLocation.y+1)){
    		currentLocation.y++;
    	}  			
    }
	
}

