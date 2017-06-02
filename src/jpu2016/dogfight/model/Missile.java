package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	
	private int distanceTraveled;
	
	public Missile() {
		this.distanceTraveled = 0;
	}
}
