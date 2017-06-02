package jpu2016.dogfight.model;

public class Position {
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double y, double maxX, double maxY) {
		try {
			if (maxX <= 0 || maxY <= 0) {
				throw new Exception();
			}

			this.x = x;
			this.y = y;
			this.maxX = maxX;
			this.maxY = maxY;
		} catch (Exception error) {
			System.out.println("ERROR (Position constructor): max coordinates cannot be negative or null.");
			System.exit(-1);
		}
	}
	
	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x % this.maxX;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y % this.maxY;
	}

	void setMaxX(double maxX) {
		try {
			if (maxX <= 0) {
				throw new Exception();
			}
			
			this.maxX = maxX;
		} catch (Exception error) {
			System.out.println("ERROR (Position maxX setter): Position max coordinates cannot be negative or null.");
			System.exit(-1);
		}
	}

	void setMaxY(double maxY) {
		try {
			if (maxY <= 0) {
				throw new Exception();
			}
			
			this.maxY = maxY;
		} catch (Exception error) {
			System.out.println("ERROR (Position maxY setter): Position max coordinates cannot be negative or null.");
			System.exit(-1);
		}
	}
	
	
}
