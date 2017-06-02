package jpu2016.dogfight.model;

public class Dimension {
	private int width;
	private int height;
	
	public Dimension(int width, int height) {
		try {
			if(width < 0 || height < 0) {
				throw new Exception();
			}
			
			this.width = width;
			this.height = height;
		} catch (Exception error) {
			System.out.println("ERROR (Dimension constructor): Lengths cannot be negative.");
			System.exit(-1);
		}
	}
	
	public Dimension(Dimension dimension) {
		this.width = dimension.width;
		this.height = dimension.height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		try {
			if (width < 0) {
				throw new Exception();
			}

			this.width = width;
		} catch (Exception error) {
			System.out.println("ERROR (Dimension width setter): Lengths cannot be negative.");
			System.exit(-1);
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		try {
			if (height < 0) {
				throw new Exception();
			}

			this.height = height;
		} catch (Exception error) {
			System.out.println("ERROR (Dimension height setter): Lengths cannot be negative.");
			System.exit(-1);
		}
	}
}
