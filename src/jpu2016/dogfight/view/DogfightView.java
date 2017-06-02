package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable {

	public String message;
	
	public DogfightView(IOrderPerformer oderPerformer, IDogfightModel dogfightModel, Observable observable ) {
		
	}
	
	private void run() {
		
	}
	
	public String displayMessage(String message) {
		return this.message = message;
	}
	
	public void closeAll() {
		
	}

}
