package guiprograms;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SliderExample extends JFrame {
	
	DegreeSlider ds;
	JButton submit;

	public SliderExample() {}
	
	public void createGUI() {
		this.setLayout(new FlowLayout());
		ds = new DegreeSlider();
		this.add(ds);
		submit = new JButton("submit");
		this.add(submit);
		submit.addActionListener(new ClickListener());
		showIt();
	}
	
	public void onSubmit(){
		System.out.println(ds.getValue());
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
		this.setVisible(true);
	}

	class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			onSubmit();
		}
		
	}
	
}
