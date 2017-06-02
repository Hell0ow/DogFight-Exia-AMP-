package jpu2016.dogfight.controller;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Mobile;
import jpu2016.dogfight.view.IViewSystem;


public class DogfightController implements IOrderPerformer {
	
	static private int TIME_SLEEP = 30;
	protected DogfightModel dogfightModel;
	
	public DogfightController(IDogfightModel dogfightModel){
		dogfightModel = new DogfightModel();
	}
	
	public void orderPerform(UserOrder userOrder){
	}
	
	public void play(){
	}
	
	public void setViewSystem(IViewSystem viewSystem){
	}
	
	private void launchMissile(int player){
		IMobile plane = dogfightModel.getMobileByPlayer(player);
		dogfightModel.addMobile(new Missile(plane.getDirection(), plane.getPosition()));
	}
	
	private void gameLoop(){
	}
	
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) { 
		if(((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() / weapon.getWidth())) && ((weapon.getPosition().getX() / weapon.getWidth()) <= ((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) { 
			if(((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY() / weapon.getHeight())) && ((weapon.getPosition().getY() / weapon.getHeight()) <= ((mobile.getPosition().getY() + mobile.getHeight())/ weapon.getHeight()))) { 
				return true; 
			} 
		} 
		return false;
	}
	
	private int manageCollision(IMobile mobile, IMobile weapon){
		if(isWeaponOnMobile(mobile, weapon) == true){
			dogfightModel.removeMobile(weapon);
			return 0; //hit
		}
		else{
			return 1;
			
		}
	}
}
