package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private ArrayList<IMobile> mobiles;
	private Sky sky;
	
	public DogfightModel() {
		sky = new Sky(new Dimension(1, 1));
		mobiles = new ArrayList<IMobile>();
	}
	
	public IArea getArea() {
		return sky;
	}
	
	public void buildArea(Dimension dimension) {
		sky = new Sky(dimension);
	}
	
	public void addMobile(IMobile mobile) {
		mobiles.add(mobile);
	}
	
	public void removeMobile(IMobile mobile) {
		mobiles.remove(mobile);
	}
	
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}
	
	public IMobile getMobileByPlayer(int player) {
		for(int i = 0; i < mobiles.size(); i++) {
			if (mobiles.get(i).isPlayer(player))
				return mobiles.get(i);
		}
		
		return null;
	}
	
	public void setMobilesHavesMove() {
		/*TO COMPLETE*/
	}
}
