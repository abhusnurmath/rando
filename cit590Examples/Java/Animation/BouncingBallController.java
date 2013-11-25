import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BouncingBallController extends JFrame {
	JPanel buttonPanel = new JPanel();
	JButton runButton = new JButton("Stop");
	JButton stopButton = new JButton("Run");
	Timer timer;

	BouncingBallModel model = new BouncingBallModel();
	BouncingBallView view = new BouncingBallView(model);

	public void init() {
		layOutComponents();
		attachListenersToComponents();
		// Connect model and view
		model.addObserver(view);
	}

	private void layOutComponents() {
		setLayout(new BorderLayout());
		this.add(BorderLayout.SOUTH, buttonPanel);
		buttonPanel.add(runButton);
		buttonPanel.add(stopButton);
		stopButton.setEnabled(false);
		this.add(BorderLayout.CENTER, view);
	}

	private void attachListenersToComponents() {
		runButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				runButton.setEnabled(false);
				stopButton.setEnabled(true);
				timer = new Timer(true);
				timer.schedule(new Strobe(), 0, 40); //task, delay, duration (milliseconds)
			}
		});
		stopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				runButton.setEnabled(true);
				stopButton.setEnabled(false);
				timer.cancel();
			}
		});
	}

	private class Strobe extends TimerTask {
		public void run() {
			model.setLimits(view.getWidth(), view.getHeight());
			model.makeOneStep();
			}
	}
	
	public static void main(String[] args) {
		BouncingBallController controllerApp = new BouncingBallController();
		controllerApp.init();
		controllerApp.setSize(300, 300);
		controllerApp.setVisible(true);
		controllerApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}



