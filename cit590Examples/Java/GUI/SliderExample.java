package guiprograms;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SliderExample extends JFrame {
	
	DegreeSlider cs;
	DegreeSlider fs;
	JButton submit;

	public SliderExample() {}
	
	public void createGUI() {
	    JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JLabel celsius = new JLabel("celsius");
		p1.add(celsius);
		cs = new DegreeSlider();
		p1.add(cs);
		JLabel fahrenheit = new JLabel("fahrenheit");
		p1.add(fahrenheit);
		fs = new DegreeSlider();
		p1.add(fs);
		this.add(p1,BorderLayout.NORTH);
		submit = new JButton("submit");
		submit.addActionListener(new ClickListener());
		this.add(submit,BorderLayout.CENTER);
		showIt();
	}
	
	public void onSubmit(){
		int celsius = cs.getValue();
		int fahr = (int)(9/5.0 * celsius + 32.0);
		fs.setValue(fahr);
	}
	
	public static void main(String[] args) {
		new SliderExample().createGUI();
	}
	
	/***
	 * a method that only exists 
	 * because JFrame's show up in this
	 * super tiny minimized manner.
	 */
	private void showIt(){
		this.setMinimumSize(new Dimension(640,480));
		this.setLocation(50, 100);
		pack();
		this.setVisible(true);
	}

	class ClickListener implements KeyListener, ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			onSubmit();
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
