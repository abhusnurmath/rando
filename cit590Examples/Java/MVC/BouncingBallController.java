package mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BouncingBallController extends JApplet {
	JPanel buttonPanel = new JPanel();
	JButton stepButton = new JButton("Step");

	BouncingBallModel model = new BouncingBallModel();
	BouncingBallView view = new BouncingBallView(model);

	public void init() {
		setLayout(new BorderLayout());
		buttonPanel.add(stepButton);
		this.add(BorderLayout.SOUTH, buttonPanel);
		this.add(BorderLayout.CENTER, view);

		// add listener so that when the stepButton is clicked
		// a step is made
		stepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				model.makeOneStep();
			}
		});

		model.addObserver(view);
		view.controller = this;
	}

	@Override
	public void start() {
		model.xLimit = view.getSize().width - model.BALL_SIZE;
		model.yLimit = view.getSize().height - model.BALL_SIZE;
		repaint();

	}
}
