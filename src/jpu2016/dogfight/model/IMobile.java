package jpu2016.dogfight.model;

import java.awt.Image;

public interface IMobile {
	public Direction getDirection();

	public void setDirection(Direction direction);
	
	public Position getPosition();
	
	public Dimension getDimension();

	public int getSpeed();

	public int getWidth();
	
	public int getHeight();
	
	public Image getImage();
	
	public void move();
	
	public void placeInArea(IArea area);
	
	public boolean isPlayer(int player);
	
	public void setDogfightModel(IDogfightModel dogfightModel);
	
	public boolean hit();
	
	public boolean isWeapon();
}
