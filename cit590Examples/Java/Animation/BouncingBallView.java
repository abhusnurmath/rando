
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class BouncingBallView extends Canvas implements Observer {
	BouncingBallController controller;
	BouncingBallModel model;
	int stepNumber = 0;

	BouncingBallView(BouncingBallModel model) {
		this.model = model;
	}

	@Override
	/***
	 * this gets called when the model does notifyObservers()
	 */
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
  
	/***
	 * this method tells us what is drawn on the canvas
	 */
	public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        g.fillOval(model.getX(), model.getY(),model.BALL_SIZE, model.BALL_SIZE);
	}
}