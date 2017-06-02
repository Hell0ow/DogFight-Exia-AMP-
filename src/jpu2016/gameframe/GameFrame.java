package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.GraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener {
	
	private static final long serialVersionUID = -1112124206501543946L;
	static public int ZOOM = 10;
	private final IDogfightModel dogfightModel;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		this.setTitle(title); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);	
		this.setVisible(true);
		final GamePanel gamePanel = new GamePanel(new GraphicsBuilder(dogfightModel)); 
		this.setContentPane(gamePanel); 
		this.setSize((dogfightModel.getWidth() * 5) + this.getInsets().left + this.getInsets().right, (dogfightModel.getHeight() * 5) + this.getInsets().top + this.getInsets().bottom); 
		this.setLocationRelativeTo(null);
        this.setVisible(true);
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		
	}
	
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		
	}

}
