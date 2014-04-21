import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BouncingBallController extends JFrame{
	JPanel buttonPanel = new JPanel();
	JButton runButton = new JButton("Run");
	JButton stopButton = new JButton("Stop");
	Timer timer;

	BouncingBallModel model = new BouncingBallModel();
	BouncingBallView view = new BouncingBallView(model);

	public void create() {
		layOutComponents();
		attachListenersToComponents();
		addKeyListener(new KeyListenerClass());
		setFocusable(true);
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
	
	
	class KeyListenerClass implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			 if(e.getKeyCode() == KeyEvent.VK_UP){
				 model.setColor(Color.blue);
				 model.makeLineBigger();
			 }
			 if(e.getKeyCode() == KeyEvent.VK_DOWN){
				 model.setColor(Color.yellow);
				 model.makeLineSmaller();
			 }
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
	}

	
	public static void main(String[] args) {
		BouncingBallController controllerApp = new BouncingBallController();
		controllerApp.create();
		controllerApp.setSize(300, 300);
		controllerApp.setVisible(true);
		controllerApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
}



