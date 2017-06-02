package jpu2016.dogfight.view;

import java.util.Observable;

public class DogfightView implements IViewSystem, Runnable {

	public String message;
	
	public DogfightView(IOderPerformer oderPerformer, IDogfightModel dogfightModel, Observable observable ) {
		
	}
	
	private void run() {
		
	}
	
	public String displayMessage(String message) {
		return this.message = message;
	}
	
	public void closeAll() {
		
	}

}
