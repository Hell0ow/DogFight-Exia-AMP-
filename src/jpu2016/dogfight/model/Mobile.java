package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile {
	protected Dimension dimension;
	protected Direction direction;
	protected Position position;
	protected Image[] images;
	protected int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.dimension = dimension;
		this.direction = direction;
		this.position = position;
		this.images = new Image[4];
	}
	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return position;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public int getSpeed() {
		return speed;
	}

	public int getWidth() {
		return dimension.getWidth();
	}
	
	public int getHeight() {
		return dimension.getHeight();
	}
	
	public void move() {
		switch (direction) {
			case UP:
				moveUp();
				break;
			case RIGHT:
				moveRight();
				break;
			case DOWN:
				moveDown();
				break;
			case LEFT:
				moveLeft();
				break;
		}
	}
	
	public void placeInArea(IArea area) {
		/*TO COMPLETE*/
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	
	protected void moveUp() {
		position.setY(position.getY() + speed);
	}
	
	protected void moveRight() {
		position.setX(position.getX() + speed);
	}
	
	protected void moveDown() {
		position.setY(position.getY() - speed);
	}

	protected void moveLeft() {
		position.setX(position.getX() - speed);
	}
	
	public Color getColor() { /* MAY BE FAKE NEWS*/
		return new Color(1); /*TO COMPLETE*/
	}
	
	public IDogfightModel getDogfightModel() {
		/*TO COMPLETE*/
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		/*TO COMPLETE*/
	}
	
	public boolean hit() {
		return false;
	}
	
	public boolean isWeapon() {
		return false;
	}
	
	public Image getImage() {
		switch (direction) {
			case UP:
				return images[0];
			case RIGHT:
				return images[1];
			case DOWN:
				return images[2];
			case LEFT:
				return images[3];
			default:
				return images[0];
		}
	}
}
