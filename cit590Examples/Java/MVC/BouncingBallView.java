package mvc;

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
	public void update(Observable arg0, Object arg1) {
		repaint();
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(model.xPosition, model.yPosition, model.BALL_SIZE,
				model.BALL_SIZE);
		controller.showStatus("Step " + (stepNumber++) + ", x = "
				+ model.xPosition + ", y = " + model.yPosition);

	}
}