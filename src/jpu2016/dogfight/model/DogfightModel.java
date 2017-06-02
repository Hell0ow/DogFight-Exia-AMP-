package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private ArrayList<IMobile> mobiles;
	private Sky sky;
	
	public DogfightModel() {
		sky = new Sky(new Dimension(1, 1)); /*TO COMPLETE*/
	}
	
	public IArea getArea() {
		return sky;
	}
	
	public void buildArea(Dimension dimension) {
		sky = new Sky(dimension);
	}
	
	public void addMobile(IMobile mobile) {
		/*TO COMPLETE*/
	}
	
	public void removeMobile(IMobile mobile) {
		/*to complete*/
	}
	
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}
	
	public IMobile getMobilesByPlayer(int player) {
		return new Mobile(null, new Position(1, 1, 1, 1), new Dimension(1, 1), 1, "String");
	}
	
	public void setMobilesHavesMove() {
		/*TO COMPLETE*/
	}
}
