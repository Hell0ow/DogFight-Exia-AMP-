package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled;
	
	public Missile(Direction direction, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		distanceTraveled = 0;
	}
	
	public static int getWidthWithADirection(Direction direction) {
		return 1; /*TO COMPLETE*/
	}
	
	public static int getHeightWithADirection(Direction direction) {
		return 1; /*TO COMPLETE*/
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
		
		distanceTraveled += speed;
		
		if (distanceTraveled >= MAX_DISTANCE_TRAVELED) {
			
		}
	}
	
	public boolean isWeapon() {
		return true;
	}
}
