package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import jpu2016.dogfight.view.GraphicsBuilder;

public class GamePanel extends JPanel implements Observer {
	
	private static final long serialVersionUID = 3987064896591403626L;
	private final GraphicsBuilder graphicsBuilder;

	public GamePanel(IGraphicsBuilder graphicBuilder) {
		
	}
	
	public void update(Observable observable) {
		
	}
	
	public void paintComponent(Graphics graphic) {
		this.graphicsBuilder.applyModelToGraphic(graphic, observer);
	}

	@Override
	public void update(Observable o, Object arg) {
		
	}

}
